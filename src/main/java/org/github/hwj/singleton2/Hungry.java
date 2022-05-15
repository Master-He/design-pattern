package org.github.hwj.singleton2;

import org.omg.PortableInterceptor.INACTIVE;

public class Hungry {

    private Hungry() {

    }

    private static final Hungry INSTANCE = new Hungry();

    public static Hungry getInstance() {
        return INSTANCE;
    }

}
