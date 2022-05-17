package org.github.hwj.abstractfactory;

public class Consumer {
    public static void main(String[] args) {
        System.out.println("========华为========");

        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        Phone huaWeiPhone = huaWeiFactory.generatePhone();
        huaWeiPhone.call();
        Router huaWeiRouter = huaWeiFactory.generateRouter();
        huaWeiRouter.route();
        Computer huaWeiComputer = huaWeiFactory.generateComputer();
        huaWeiComputer.play();

        System.out.println("========小米========");

        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        Phone xiaoMiPhone = xiaoMiFactory.generatePhone();
        xiaoMiPhone.call();
        Router xiaoMiRouter = xiaoMiFactory.generateRouter();
        xiaoMiRouter.route();
        Computer xiaoMiComputer = xiaoMiFactory.generateComputer();
        xiaoMiComputer.play();
    }
}
