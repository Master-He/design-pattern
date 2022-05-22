package org.github.hwj.struct.combination;

public class MenuItem extends MenuComponent {

    public MenuItem(String name, int level) {
        super(name, level);
    }

    @Override
    public void print() {
        for (int i = 0; i < this.level; i++) {
            System.out.print("--");
        }
        System.out.println(this.name);
    }
}
