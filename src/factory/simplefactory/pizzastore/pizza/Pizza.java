package factory.simplefactory.pizzastore.pizza;

//将Pizza做成抽象类
public abstract class Pizza {
    //名字
    protected String name;

    //准备原材料,不同的披萨不一样,做成抽象方法
    public abstract void prepare();

    //烘焙
    public void bake() {
        System.out.println(name + " baking...");
    }

    //切割
    public void cut() {
        System.out.println(name + " cutting...");
    }

    //打包
    public void box() {
        System.out.println(name + " boxing...");
    }

    public void setName(String name) {
        this.name = name;
    }
}
