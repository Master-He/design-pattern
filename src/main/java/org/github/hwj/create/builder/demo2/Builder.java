package org.github.hwj.create.builder.demo2;

public abstract class Builder {

    public abstract Builder buildA(String A); // 汉堡
    public abstract Builder buildB(String B); // 可乐
    public abstract Builder buildC(String C); // 薯条
    public abstract Builder buildD(String D); // 甜点

    public abstract Product build();

}
