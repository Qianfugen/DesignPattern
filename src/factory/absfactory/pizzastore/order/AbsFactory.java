package factory.absfactory.pizzastore.order;

import factory.absfactory.pizzastore.pizza.Pizza;

//一个抽象工厂模式的抽象层(接口)
public interface AbsFactory {
    Pizza createPizza(String orderType);
}
