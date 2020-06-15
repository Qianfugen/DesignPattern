package adapter.classadapter;

public class Phone {
    //充电
    public void charging(IVoltage5V iVoltage5V) {
        int output = iVoltage5V.output5V();
        if (output == 5) {
            System.out.println("电压为5V,可以充电");
        } else if (output > 5) {
            System.out.println("电压大于5V,无法充电");
        }
    }
}
