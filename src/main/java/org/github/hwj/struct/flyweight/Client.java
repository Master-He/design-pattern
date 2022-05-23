package org.github.hwj.struct.flyweight;

public class Client {
    public static void main(String[] args) {
        BoxFactory boxFactory = BoxFactory.getInstance();
        AbstractBox i = boxFactory.getBox("I");
        i.display("红色");

        AbstractBox i2 = boxFactory.getBox("I");
        i2.display("蓝色");

        System.out.println("i 和 i2 是否是同一个对象： " + (i == i2));

        AbstractBox o = boxFactory.getBox("O");
        o.display("绿色");

        AbstractBox l = boxFactory.getBox("L");
        l.display("黑色");
    }
}
