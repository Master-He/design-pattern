package org.github.hwj.struct.decorate.runoob;

public class RedDecorator extends Decorator {

    public RedDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public String draw() {
        return "红色" + getShape().draw();
    }
}
