package org.github.hwj.abstractfactory;

public class HuaWeiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }
}
