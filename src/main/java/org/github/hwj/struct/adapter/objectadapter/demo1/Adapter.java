package org.github.hwj.struct.adapter.objectadapter.demo1;

public class Adapter implements UsbToCableAdapter {

    // 对象适配器，将网线聚合到Adapter， 遵守合成物复用原则
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
