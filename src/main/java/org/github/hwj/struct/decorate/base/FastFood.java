package org.github.hwj.struct.decorate.base;

public abstract class FastFood {

    private String desc;
    private float price;

    public FastFood() {
    }

    public FastFood(String desc, float price) {
        this.desc = desc;
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();

}
