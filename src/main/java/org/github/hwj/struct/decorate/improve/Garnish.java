package org.github.hwj.struct.decorate.improve;

public abstract class Garnish extends FastFood {

    private FastFood fastFood;

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

    @Override
    public String getDesc() {
        // 这个就是装饰
        return getFastFood().getDesc() + "加" + super.getDesc();  // 快餐描述 + 配料描述
    }

    @Override
    public float getPrice() {
        // 这个也是装饰
        return getFastFood().getPrice() + super.getPrice();  // 快餐价格 + 配料价格
    }
}
