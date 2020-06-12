package principle.singleton.type6;

public class Singleton06 {
    public static void main(String[] args) {
        System.out.println("静态内部类完成单例模式,推荐使用");
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        //true
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

//静态内部类,推荐使用,推荐使用

/**
 * 1.优点:避免了线程不安全,利用静态内部类实现懒加载,效率高
 */

class Singleton {
    private static Singleton instance;

    //构造器私有化
    private Singleton() {
    }

    //写一个静态内部类,该类中有一个静态属性Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }


    //提供一个静态的公有方法,加入双重检查代码,解决线程安全问题,同时解决懒加载问题
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
