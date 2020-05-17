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
package org.apache.ibatis.plugin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Clinton Begin
 */
public class InterceptorChain {

  private final List<Interceptor> interceptors = new ArrayList<>();

  //将执行器放进来
  public Object pluginAll(Object target) {
    //所有的拦截器
    for (Interceptor interceptor : interceptors) {
      //说白了就是构建一个代理类  然后每一个拦截器可以说都是一个代理套代理
      //interceptor.plugin(target)这个就是返回一个代理
      //那么一直循环就是一直代理
      //拦截器1  拦截器3  拦截器3  拦截器4  ----> target
      //List是有顺序的  所以xml  要按顺序来
      target = interceptor.plugin(target);
    }
    return target;
  }

  public void addInterceptor(Interceptor interceptor) {
    interceptors.add(interceptor);
  }

  public List<Interceptor> getInterceptors() {
    return Collections.unmodifiableList(interceptors);
  }

}
