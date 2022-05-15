package org.github.hwj.singleton;

public class DoubleCheckLockSingleton {
    // 2. 准备静态的实例对象，但是对象不初始化，值为null. // 注意：这里用了volatile是为了变量的可见性，一个线程对这个变量的修改对另外一个线程可见
    private volatile static DoubleCheckLockSingleton instance;

    // 1. 私有化构造器
    private DoubleCheckLockSingleton() {

    }

    // 3. 提供一个静态方法，返回静态的实例对象
    public static DoubleCheckLockSingleton getInstance() {

        if (instance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }

        return instance;
    }

    public static void main(String[] args) {
        // 三次打印结果相同
        new Thread(() -> System.out.println(getInstance().hashCode())).start();
        new Thread(() -> System.out.println(getInstance().hashCode())).start();
        new Thread(() -> System.out.println(getInstance().hashCode())).start();
    }
}
