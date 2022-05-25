package org.github.hwj.behavior.command.demo2;

//调用者：服务员
public class Waiter {
    private Breakfast changFen, hunTun, heFen;

    public void setChangFen(Breakfast f) {
        changFen = f;
    }

    public void setHunTun(Breakfast f) {
        hunTun = f;
    }

    public void setHeFen(Breakfast f) {
        heFen = f;
    }

    public void orderChangFen() {
        changFen.cooking();
    }

    public void orderHunTun() {
        hunTun.cooking();
    }

    public void orderHeFen() {
        heFen.cooking();
    }
}