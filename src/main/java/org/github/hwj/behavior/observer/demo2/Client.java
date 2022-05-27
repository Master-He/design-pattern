package org.github.hwj.behavior.observer.demo2;

public class Client {

    public static void main(String[] args) {
        // 例子： 原油期货, 玉米期货价格波动（被观察者）， 空方和多方（观察者）
        Bull bull = new Bull(); // 原油期货上涨，多头开心
        Bear bear = new Bear(); // 原油期货下跌，空头开心
        Futures oilFutures = new Futures("原油期货");
        oilFutures.addObserver(bear);
        oilFutures.addObserver(bull);

        Bull producer = new Bull(); // 玉米期货上涨，玉米生产者开心
        Bear consumer = new Bear(); // 玉米期货下跌，玉米消费者开心
        Futures cornFutures = new Futures("玉米期货");
        cornFutures.addObserver(producer);
        cornFutures.addObserver(consumer);

        oilFutures.setPrice(10);
        oilFutures.setPrice(-8);

        cornFutures.setPrice(100);
        cornFutures.setPrice(-50);
    }
}
