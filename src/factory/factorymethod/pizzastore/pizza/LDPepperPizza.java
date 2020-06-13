package factory.factorymethod.pizzastore.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的胡椒披萨");
        System.out.println("伦敦的胡椒披萨 原料准备中...");
    }
}
