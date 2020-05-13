package niwo.util.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by web on 2020/5/13.
 */
public class JDKProxy implements InvocationHandler{

   private Object object;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("处理前");
        //这里要用具体的对象  而不是代理  否则出现无限循环
        Object invoke = method.invoke(object, args);
        return invoke;
    }
    //create proxy
    //传入的对象
    public Object createProxy(Object object){
        //这里可以看出一定要实现接口
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }
}
