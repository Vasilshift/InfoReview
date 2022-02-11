package DynamicProxyTest;
import java.lang.reflect.Proxy;
import java.util.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        InvocationHandler invocationHandler = new MyProxy(5);
        Class[] classes = new Class[] {Comparable.class, Callable.class};
        Object proxy = Proxy.newProxyInstance(null, classes, invocationHandler);
        System.out.println(proxy.toString());

    }

    public static class MyProxy implements InvocationHandler {

        Object target;

        public MyProxy(Object target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(args);
            return "bla";
        }
    }

}
