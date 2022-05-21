package org.github.hwj.struct.adapter.objectadapter.demo2;

public class AdapterImpl implements Adapter {
    @Override
    public int convert220Vto5V(int input220V) {
        System.out.println("2. 220V电压转换成5V电压");
        return input220V / 44;
    }
}
