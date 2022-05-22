package org.github.hwj.struct.decorate.base;

public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super("培根", 2f, fastFood);
        setPrice(getPrice() + getFastFood().getPrice());
    }

    public float cost() {
        return getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();  // 配料描述+快餐描述
    }
}
