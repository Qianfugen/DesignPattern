package decorator;

public class CoffeBar {
    public static void main(String[] args) {
        //装饰者模式下的订单: 2份巧克力+1份牛奶的LongBlack

        //1.一份LongBlack
        Drink order = new LongBlack();
        System.out.println("费用1 = " + order.cost());
        System.out.println("描述信息 = " + order.getDes());

        //2.加入1份牛奶
        order = new Milk(order);
        System.out.println("order加入一份牛奶后");
        System.out.println("费用1 = " + order.cost());
        System.out.println("描述信息 = " + order.getDes());

        //3.再加入一份巧克力
        order = new Chocolate(order);
        System.out.println("再加入一份巧克力");
        System.out.println("费用1 = " + order.cost());
        System.out.println("描述信息 = " + order.getDes());

        //4.又加入一份巧克力
        order = new Chocolate(order);
        System.out.println("又加入一份巧克力");
        System.out.println("费用1 = " + order.cost());
        System.out.println("描述信息 = " + order.getDes());

        System.out.println("===========================================================");
        Drink order2 = new Decaf();
        System.out.println("费用2 = " + order2.cost());
        System.out.println("描述信息 = " + order2.getDes());

        //加一分巧克力
        order2 = new Chocolate(order2);
        System.out.println("加入一份巧克力");
        System.out.println("费用2 = " + order2.cost());
        System.out.println("描述信息 = " + order2.getDes());
    }
}
