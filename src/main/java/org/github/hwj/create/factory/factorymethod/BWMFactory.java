package org.github.hwj.create.factory.factorymethod;

public class BWMFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new BWM();
    }
}
