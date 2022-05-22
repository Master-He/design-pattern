package org.github.hwj.struct.decorate.base;

public class FiredRices extends FastFood {

    public FiredRices() {
        super("炒饭", 10f);
    }

    @Override
    public float cost() {
        return getPrice();
    }

}
