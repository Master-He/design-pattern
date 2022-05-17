package org.github.hwj.factory.factorymethod;


public class Consumer {

    public static Car getCar(CarFactory factory) {
        // 满足了对修改关闭
        return factory.getCar();
    }

    public static void main(String[] args) {
        Car byd = getCar(new BYDFactory());
        System.out.println(byd.getName());

        Car byd2 = getCar(CarFactory.getBydFactory());
        System.out.println(byd2.getName());

        Car bwm = getCar(new BWMFactory());
        System.out.println(bwm.getName());

        Car tesla = getCar(new TeslaFactory());
        System.out.println(tesla.getName());

    }
}
