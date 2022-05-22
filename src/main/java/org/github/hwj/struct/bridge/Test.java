package org.github.hwj.struct.bridge;

public class Test {
    public static void main(String[] args) {
        // 电脑类型有台式电脑，笔记本电脑，平板电脑。 品牌类型有小米，苹果，华为
        Laptop macBookPro = new Laptop(new Apple());
        System.out.println(macBookPro.info());

        Tablet huaweiPad = new Tablet(new HuaWei());
        System.out.println(huaweiPad.info());

        Desktop xiaoMiDesktop = new Desktop(new XiaoMi());
        System.out.println(xiaoMiDesktop.info());
    }
}
