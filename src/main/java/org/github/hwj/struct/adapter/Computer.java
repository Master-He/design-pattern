package org.github.hwj.struct.adapter;

public class Computer {

    private final UsbToCable usbToCable;

    public Computer(UsbToCable usbToCable) {
        this.usbToCable = usbToCable;
    }

    public void net() {
        System.out.println("1.电脑想上网，连适配器");
        usbToCable.handleRequest();
    }

    public static void main(String[] args) {
        Cable cable = new Cable(); // 弄一根网线
        Adapter adapter = new Adapter(cable); // 适配器插上网线
        Computer computer = new Computer(adapter); // 电脑插上适配器

        computer.net();

    }

}
