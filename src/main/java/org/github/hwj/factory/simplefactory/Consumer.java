package org.github.hwj.factory.simplefactory;

public class Consumer {
    public static void main(String[] args) {

        Car byd = CarFactory.getCar("BYD");
        Car bwm = CarFactory.getCar("BWM");

        if (byd == null) {
            System.out.println("get BYD error");
        } else {
            System.out.println(byd.getName());
        }

        if (bwm == null) {
            System.out.println("get BWM error");
        } else {
            System.out.println(bwm.getName());
        }

    }
}
