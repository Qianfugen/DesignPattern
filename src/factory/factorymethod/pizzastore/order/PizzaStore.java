package factory.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PizzaStore {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String choose = null;
            System.out.println("请选择: 1.北京披萨 2.伦敦披萨");
            while ((choose = reader.readLine()) != null) {
                if (choose.equals("1")) {
                    //创建北京口味的披萨
                    new BJOrderPizza();
                } else if (choose.equals("2")) {
                    //创建伦敦口味的披萨
                    new LDOrderPizza();
                } else {
                    break;
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
