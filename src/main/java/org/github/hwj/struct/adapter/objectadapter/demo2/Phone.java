package org.github.hwj.struct.adapter.objectadapter.demo2;

public class Phone {
    public void charge(Adapter adapter, int input220V) {
        System.out.println("3. 手机正在充电，电压为：" + adapter.convert220Vto5V(input220V) + "V");
    }

    /**
     * 演示类适配器
     * 缺点： Adapter需要继承Source220V， Source5V需要是接口。
     */
    public static void main(String[] args) {

        Phone phone = new Phone();  // 买个手机
        Adapter adapter = new AdapterImpl();  // 买个充电适配器
        int input220V = Source220V.output220V(); // 输入电源是220V
        phone.charge(adapter, input220V); // 手机插上适配器，适配器插入220V电源, 手机就可以充电了

    }
}
