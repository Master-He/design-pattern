package org.github.hwj.singleton;

public class StaticInnerClassSingleton {

    // 1. 私有化构造器
    private StaticInnerClassSingleton() {

    }

    // 2.写一个静态内部类，因为静态内部类的属性等到真正调用时才会被类加载器加载。这就可以实现懒加载，同时因为是类加载器加载，保证了线程安全
    private static class SingletonHolder  {
        // 注意属性也是静态的
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    // 3.写提供实例的静态方法
    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        // 三次打印结果相同
        new Thread(() -> System.out.println(getInstance().hashCode())).start();
        new Thread(() -> System.out.println(getInstance().hashCode())).start();
        new Thread(() -> System.out.println(getInstance().hashCode())).start();
    }
}
