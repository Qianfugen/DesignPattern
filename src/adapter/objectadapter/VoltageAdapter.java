package adapter.objectadapter;

//适配器类
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dstV = 0;
        if (voltage220V != null) {
            //获取到220V
            int srcV = voltage220V.output220V();
            //降压
            dstV = srcV / 44;
        }
        return dstV;
    }
}
