package org.github.hwj.struct.adapter;

public class Adapter implements UsbToCable {

    private final Cable cable;

    public Adapter(Cable cable) {
        this.cable = cable;
    }

    @Override
    public void handleRequest() {
        System.out.println("2.适配器连接网线");
        cable.request();
    }
}
