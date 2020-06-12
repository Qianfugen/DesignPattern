package principle.singleton.type7;

public class SingletonTest07 {
    public static void main(String[] args) {
        System.out.println("使用枚举,推荐使用");
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        //true
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        instance.sayOK();
        instance2.sayOK();
    }
}

enum Singleton {
    INSTANCE;

    public void sayOK() {
        System.out.println("OK!");
    }
}
