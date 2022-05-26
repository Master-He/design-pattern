package org.github.hwj.behavior.state.demo2;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        System.out.println("开始" + context.getState());

        context.open();
        context.close();
        context.run();
        context.stop();
        context.open();
        context.close();

        System.out.println("最后" + context.getState());
    }
}
