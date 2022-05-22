package org.github.hwj.struct.decorate.runoob;

public class Client {

    /**
     * 参考 菜鸟教程装饰器模式案例
     * 链接：https://www.runoob.com/design-pattern/decorator-pattern.html
     */
    public static void main(String[] args) {
        Shape redCircle = new RedDecorator(new Circle());
        System.out.println(redCircle.draw());

        Shape blueRectangle = new BlueDecorator(new Rectangle());
        System.out.println(blueRectangle.draw());
    }
}
