package org.github.hwj.struct.decorate.base;

public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super("鸡蛋", 1f, fastFood);
        setPrice(getPrice() + getFastFood().getPrice());
    }

    public float cost() {
        return getPrice();  // 配料价格+快餐价格
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();  // 配料描述+快餐描述
    }
}
