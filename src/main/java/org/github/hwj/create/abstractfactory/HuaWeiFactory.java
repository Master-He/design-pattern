package org.github.hwj.create.abstractfactory;

public class HuaWeiFactory implements ProductFactory {
    @Override
    public Phone generatePhone() {
        return new HuaWeiPhone();
    }

    @Override
    public Router generateRouter() {
        return new HuaWeiRoute();
    }

    @Override
    public Computer generateComputer() {
        return new HuaWeiComputer();
    }
}
