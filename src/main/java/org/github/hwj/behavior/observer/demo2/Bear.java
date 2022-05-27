package org.github.hwj.behavior.observer.demo2;

import java.util.Observable;
import java.util.Observer;

public class Bear implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Futures futures = (Futures) o;
        float price = (float) arg;
        if (futures.getPrice() <= 0) {
            // 价格可以对象中获取
            System.out.println(futures.getName() + "期货价格下跌了" + (-futures.getPrice()) + "元，空方很开心！");
        } else {
            // 价格也可以从参数中获取
            System.out.println(futures.getName() + "期货价格上涨了" + price + "元，空方很伤心！");
        }
    }
}
