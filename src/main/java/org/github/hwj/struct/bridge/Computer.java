package org.github.hwj.struct.bridge;

public abstract class Computer {
    // 这里用了protected, 让子类能够继承，这是一个细节
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public String info() {
        // 这个地方就是我理解的桥， Computer子类通过这个调用Brand子类的方法
        return brand.info();
    }
}
