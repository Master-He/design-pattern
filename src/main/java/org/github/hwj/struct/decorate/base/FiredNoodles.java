package org.github.hwj.struct.decorate.base;

public class FiredNoodles extends FastFood {

    public FiredNoodles() {
        super("炒面", 12f);
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
