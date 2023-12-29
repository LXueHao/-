package 动态代理.Demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static UserService createProxyUtil(User user) {
        UserService serviceProxy = (UserService) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{UserService.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().equals("find") || method.getName().equals("number")
                                || method.getName().equals("people")) {
                            long startTime = System.currentTimeMillis();
                            Object ob = method.invoke(user, args);
                            long endTime = System.currentTimeMillis();
                            System.out.println(method.getName() + "方法耗时" + (endTime - startTime) / 1000.0 + "s");
                            return ob;
                        } else {
                            Object ob = method.invoke(user, args);
                            return ob;
                        }

                    }
                });
        return serviceProxy;
    }
}
