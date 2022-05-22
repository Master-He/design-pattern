package org.github.hwj.struct.decorate.base;

public abstract class Garnish extends FastFood {

    protected FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(String desc, float price, FastFood fastFood) {
        super(desc, price);
        this.fastFood = fastFood;
    }
}
