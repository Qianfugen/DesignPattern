package principle.singleton.type2;

public class SingletonTest02 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        //true
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}

//饿汉式(静态代码块)
/**
 * 1.优点:写法简单,在类装载时就已经完成实例化,避免线程同步问题
 * 2.缺点:在类装载时就实例化,没有懒加载的效果,如果没有被使用,造成内存浪费
 */
class Singleton {
    //1.构造器私有化,外部能new
    private Singleton() {

    }

    //2.本类内部创建对象实例
    private static Singleton instance;

    static {
        //在静态代码块中创建单例对象
        instance = new Singleton();
    }

    //3.提供一个公有的静态方法,返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}