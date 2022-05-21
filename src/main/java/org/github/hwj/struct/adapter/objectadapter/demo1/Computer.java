package org.github.hwj.struct.adapter.objectadapter.demo1;

public class Computer {

    public void net(UsbToCableAdapter usbToCableAdapter) {
        System.out.println("1.电脑想上网，连适配器");
        usbToCableAdapter.handleRequest();
    }

    public static void main(String[] args) {
        Cable cable = new Cable(); // 弄一根网线
        Adapter adapter = new Adapter(cable); // 适配器插上网线
        Computer computer = new Computer();
        computer.net(adapter); // 电脑插上适配器

    }

}
