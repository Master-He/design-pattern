package org.github.hwj.behavior.state.demo1;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }
}
