package org.github.hwj.struct.combination;

import java.util.LinkedList;
import java.util.List;

public class Menu extends MenuComponent {
    private final List<MenuComponent> menuComponents = new LinkedList<>();

    public Menu(String name, int level) {
        super(name, level);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public void print() {
        for (int i = 0; i < this.level; i++) {
            System.out.print("--");
        }
        System.out.println(this.name);
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
