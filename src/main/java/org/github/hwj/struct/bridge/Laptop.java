package org.github.hwj.struct.bridge;

public class Laptop extends Computer {

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public String info() {
        return super.info() + "笔记本电脑";
    }

}
