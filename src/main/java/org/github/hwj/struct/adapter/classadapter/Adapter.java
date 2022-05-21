package org.github.hwj.struct.adapter.classadapter;

public class Adapter extends Source220V implements Source5V {

    @Override
    public int output5V() {
        return output220V() / 44;
    }

}
