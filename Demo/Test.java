package 动态代理.Demo;

public class Test {
    public static void main(String[] args) {
        UserService u = ProxyUtil.createProxyUtil(new User());
        u.find();
        u.number();
        u.people();
    }
}
