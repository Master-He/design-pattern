package org.github.hwj.abstractfactory;

public class XiaoMiFactory implements ProductFactory {
    @Override
    public Phone generatePhone() {
        return new XiaoMiPhone();
    }

    @Override
    public Router generateRouter() {
        return new XiaoMiRoute();
    }

    @Override
    public Computer generateComputer() {
        return new XiaoMiComputer();
    }
}
