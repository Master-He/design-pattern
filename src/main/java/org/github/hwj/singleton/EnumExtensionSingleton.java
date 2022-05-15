package org.github.hwj.singleton;

public enum EnumExtensionSingleton {
    INSTANCE0,
    INSTANCE1("instance1"),
    INSTANCE2("instance2");

    EnumExtensionSingleton() {

    }

    String name;
    EnumExtensionSingleton(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // 三次打印结果相同
        new Thread(() -> System.out.println(EnumExtensionSingleton.INSTANCE0.hashCode())).start();
        new Thread(() -> System.out.println(EnumExtensionSingleton.INSTANCE0.hashCode())).start();
        new Thread(() -> System.out.println(EnumExtensionSingleton.INSTANCE0.hashCode())).start();

        // 三次打印结果相同
        new Thread(() -> System.out.println(EnumExtensionSingleton.INSTANCE1.hashCode())).start();
        new Thread(() -> System.out.println(EnumExtensionSingleton.INSTANCE1.hashCode())).start();
        new Thread(() -> System.out.println(EnumExtensionSingleton.INSTANCE1.hashCode())).start();

        // 三次打印结果相同
        new Thread(() -> System.out.println(EnumExtensionSingleton.INSTANCE2.hashCode())).start();
        new Thread(() -> System.out.println(EnumExtensionSingleton.INSTANCE2.hashCode())).start();
        new Thread(() -> System.out.println(EnumExtensionSingleton.INSTANCE2.hashCode())).start();
    }
}

