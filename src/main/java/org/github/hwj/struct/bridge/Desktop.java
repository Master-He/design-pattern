package org.github.hwj.struct.bridge;

public class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public String info() {
        return super.info() + "台式电脑";
    }
}
