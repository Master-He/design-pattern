package org.github.hwj.singleton2;

public class StaticClass {
    private StaticClass() {

    }

    private static class InstanceHolder {
        private static final StaticClass INSTANCE = new StaticClass();
    }

    public static StaticClass getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
