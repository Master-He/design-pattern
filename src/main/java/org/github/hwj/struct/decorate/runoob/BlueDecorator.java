package org.github.hwj.struct.decorate.runoob;

public class BlueDecorator extends Decorator {

    public BlueDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public String draw() {
        return "蓝色" + getShape().draw();
    }
}
