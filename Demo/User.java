package 动态代理.Demo;

public class User implements UserService {

    public void find() {
        System.out.println("查询人数~~");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void number() {
        System.out.println("获得总数量");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void people() {
        System.out.println("查询了10000人");
        System.out.println("查询到了周杰伦");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
