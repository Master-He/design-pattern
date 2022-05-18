package org.github.hwj.create.singleton;

public class LazyThreadUnSafetySingleton {

    // 2. 准备静态的实例对象，但是对象不初始化，值为null
    private static LazyThreadUnSafetySingleton instance;

    // 1. 私有化构造器
    private LazyThreadUnSafetySingleton() {
        // 模拟构造器初始化的耗时操作
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 3. 提供一个静态方法，返回静态的实例对象
    public static LazyThreadUnSafetySingleton getInstance() {
        if (instance == null) {
            // 这个是线程不安全的， 因为多线程可能都会同时进到这里，然后同时初始化
            instance = new LazyThreadUnSafetySingleton();
        }
        return instance;
    }


    public static void main(String[] args) {
        // 三次打印结果不同
        new Thread(() -> System.out.println(getInstance().hashCode())).start();
        new Thread(() -> System.out.println(getInstance().hashCode())).start();
        new Thread(() -> System.out.println(getInstance().hashCode())).start();
    }
}
