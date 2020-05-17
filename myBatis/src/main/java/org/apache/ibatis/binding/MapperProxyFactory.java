/**
 *    Copyright 2009-2020 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.binding;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.ibatis.binding.MapperProxy.MapperMethodInvoker;
import org.apache.ibatis.session.SqlSession;

/**
 * @author Lasse Voss
 */
//mapper工厂  我是不直接  搞个key -value  总是搞工厂
//工厂的好处在于 上下文公共环境是可以共用的  而且如果是控制对象的创建和属性都是可以控制
//但是如果直来直往  一个单一对象你将上述情况置于何地  每个对象搞套环境  或者  对象内部设定属性  使用时判断？
//但是这个工厂工作量不大  写个工厂反而有点繁琐
public class MapperProxyFactory<T> {

  private final Class<T> mapperInterface;
  //一个空的容器   方法缓存
  private final Map<Method, MapperMethodInvoker> methodCache = new ConcurrentHashMap<>();

  //代理类
  public MapperProxyFactory(Class<T> mapperInterface) {
    this.mapperInterface = mapperInterface;
  }

  public Class<T> getMapperInterface() {
    return mapperInterface;
  }

  public Map<Method, MapperMethodInvoker> getMethodCache() {
    return methodCache;
  }

  @SuppressWarnings("unchecked")
  protected T newInstance(MapperProxy<T> mapperProxy) {
    return (T) Proxy.newProxyInstance(mapperInterface.getClassLoader(), new Class[] { mapperInterface }, mapperProxy);
  }

  //更具当前session创建  代理类
  //JDK代理 三大要素
  //1.要有接口  mapperInterface传进来本身就是接口
  //2.要有被代理的类  MapperProxy
  //这里才是我们真正使用过的对象
  public T newInstance(SqlSession sqlSession) {
    final MapperProxy<T> mapperProxy = new MapperProxy<>(sqlSession, mapperInterface, methodCache);
    return newInstance(mapperProxy);
  }

}
