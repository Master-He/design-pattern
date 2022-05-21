package org.github.hwj.struct.adapter.classadapter;

public class Phone {
    public void charge(Adapter adapter) {
        System.out.println("手机正在充电，电压为：" + adapter.output5V() + "V");
    }

    /**
     * 演示类适配器
     * 缺点： Adapter需要继承Source220V， Source5V需要是接口。
     */
    public static void main(String[] args) {

        Phone phone = new Phone();  // 买个手机
        Adapter adapter = new Adapter();  // 买个充电适配器
        phone.charge(adapter); // 充电

    }
}
