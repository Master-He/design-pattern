package org.github.hwj.create.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void sayHello() {
        System.out.println("hello");
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        // 三次打印结果相同
        new Thread(() -> System.out.println(getInstance().hashCode())).start();
        new Thread(() -> System.out.println(getInstance().hashCode())).start();
        new Thread(() -> System.out.println(getInstance().hashCode())).start();

        getInstance().sayHello();
    }
}

