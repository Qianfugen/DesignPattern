package principle.singleton.type5;

public class Singleton05 {
    public static void main(String[] args) {
        System.out.println("双重检查,推荐使用");
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        //true
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

//懒汉式(线程安全,同步方法),推荐使用

/**
 * 1.优点:懒加载;线程安全;效率较高
 * 推荐使用
 */
class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    //提供一个静态的公有方法,加入双重检查代码,解决线程安全问题,同时解决懒加载问题
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
