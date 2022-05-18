package org.github.hwj.create.singleton;

/*
    可用
 */
public class HungrySingleton {
    // 1. 私有化构造器
    private HungrySingleton () {

    }

    // 2. 在对象内部创建对象实例
    private final static HungrySingleton INSTANCE = new HungrySingleton();

    // 3. 提供一个公有的静态方法，返回实例对象
    public static HungrySingleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        // 优点，不会出现线程安全问题，因为是类加载的时候创建的实例对象
        // 缺点，不能懒加载，可能会造成内存的浪费
        HungrySingleton instance1 = getInstance();
        HungrySingleton instance2 = getInstance();

        System.out.println("instance1 == instance2 ? ==> " + (instance1.hashCode() == instance2.hashCode()));
    }
}
