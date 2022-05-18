package org.github.hwj.create.builder.demo1;

// 领导指挥工人干活
public class Director {

    // 指挥工人按照顺序建房子
    public Product build(Builder builder) {
        // 构建顺序可以换, 由领导决定。
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }
}
