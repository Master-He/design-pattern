package org.github.hwj.factory.factorymethod;

public class BWMFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new BWM();
    }
}
