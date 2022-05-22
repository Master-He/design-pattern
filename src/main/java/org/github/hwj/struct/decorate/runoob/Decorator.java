package org.github.hwj.struct.decorate.runoob;

public abstract class Decorator implements Shape {
    private Shape shape;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Decorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public abstract String draw();
}
