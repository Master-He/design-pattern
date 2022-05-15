package org.github.hwj.singleton2;

public class Lazy {
    private Lazy() {

    }

    private static Lazy instance;

    public static synchronized Lazy getInstance() {
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }
}
