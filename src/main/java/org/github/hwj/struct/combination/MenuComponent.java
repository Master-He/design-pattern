package org.github.hwj.struct.combination;

public abstract class MenuComponent {
    protected String name;
    protected int level;

    public MenuComponent(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}
