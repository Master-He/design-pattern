package org.github.hwj.behavior.observer.demo2;

import java.util.Observable;
import java.util.Observer;

public class Futures extends Observable {

    private String name;
    private float price;

    public Futures(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;

        // 价格波动的时候通过观察者
        super.setChanged();
        super.notifyObservers(price);
    }

}
