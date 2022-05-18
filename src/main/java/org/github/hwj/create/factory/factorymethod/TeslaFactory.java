package org.github.hwj.create.factory.factorymethod;

public class TeslaFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
