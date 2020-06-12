package principle.singleton.type3;

public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println("懒汉式,线程不安全");
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        //true
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

    }
}

//懒汉式(线程不安全)

/**
 * 1.优点:懒加载,但是只能在单线程使用
 * 2.缺点:多线程下,可能会产生多个实例
 */
class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    //提供一个静态方法,当使用到该方法时,才去创建instance
    //即懒汉式
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
