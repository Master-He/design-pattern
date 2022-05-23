package org.github.hwj.struct.proxy.staticproxy;

public class ProxyPoint implements SellTickets{
    // 声明目标对象， 利用组合的方式
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代理点收取服务费");
        trainStation.sell();
    }
}
