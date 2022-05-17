package org.github.hwj.factory.factorymethod;

public interface CarFactory {
    Car getCar();

    // 另外补充， 可以在接口提供工厂
    CarFactory bydFactory = new BYDFactory();
    static CarFactory getBydFactory() {
        return bydFactory;
    }
}
