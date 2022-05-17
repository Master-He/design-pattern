package org.github.hwj.factory.simplefactory;

public class CarFactory {
    // 可以看出 简单工厂模式不能满足开闭原则， 如果功能稳定不需要新增功能，就可以使用简单工厂
    public static Car getCar(String name) {
        if ("BWM".equals(name)) {
            return new BWM();
        } else if ("BYD".equals(name)) {
            return new BYD();
        } else {
            return null;
        }
    }
}
