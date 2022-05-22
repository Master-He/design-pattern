package org.github.hwj.struct.bridge;

public class Tablet extends Computer {
    public Tablet(Brand brand) {
        super(brand);
    }

    @Override
    public String info() {
        return super.info() + "平板电脑";
    }
}
