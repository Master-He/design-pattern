package org.github.hwj.factory.factorymethod;

public class BYDFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new BYD();
    }
}
