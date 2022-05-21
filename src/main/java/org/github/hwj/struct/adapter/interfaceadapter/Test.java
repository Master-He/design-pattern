package org.github.hwj.struct.adapter.interfaceadapter;

public class Test {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void method1() {
                System.out.println("只实现AInterface的method1方法");
            }
        };

        absAdapter.method1();
    }
}
