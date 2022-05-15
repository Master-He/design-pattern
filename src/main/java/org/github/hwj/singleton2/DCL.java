package org.github.hwj.singleton2;

public class DCL {
    private DCL() {

    }

    private volatile static DCL instance;

    public static DCL getInstance() {
        if (instance == null) {
            synchronized (DCL.class) {
                if (instance == null) {
                    instance = new DCL();
                }
            }
        }
        return instance;
    }
}
