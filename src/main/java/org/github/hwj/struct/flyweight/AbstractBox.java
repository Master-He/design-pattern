package org.github.hwj.struct.flyweight;

public abstract class AbstractBox {
    abstract String getShape();

    public void display(String color) {
        System.out.println("俄罗斯方块形状" + getShape() + "颜色" + color);
    }
}
