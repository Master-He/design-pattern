package org.github.hwj.create.builder.demo1;

public abstract class Builder {
    abstract void buildA(); // 地基
    abstract void buildB(); // 钢筋
    abstract void buildC(); // 水泥
    abstract void buildD(); // 电线

    abstract Product getProduct(); // 完工得到产品
}
