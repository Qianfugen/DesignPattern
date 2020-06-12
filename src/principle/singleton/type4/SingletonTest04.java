package principle.singleton.type4;

public class SingletonTest04 {
    public static void main(String[] args) {
        System.out.println("懒汉式,线程安全");
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        //true
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

//懒汉式(线程安全,方法同步)
/**
 * 1.优点:解决线程安全问题
 * 2.缺点:方法进行同步效率太低
 */
class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    //提供一个静态方法,当使用到该方法时,才去创建instance,同步锁效率低
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
