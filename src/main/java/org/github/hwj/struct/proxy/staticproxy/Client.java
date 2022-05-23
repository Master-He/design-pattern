package org.github.hwj.struct.proxy.staticproxy;

public class Client {
    /**
     * 静态代理 客户不直接访问火车站， 代理类代理火车站卖票，同时赚取了一些费用（对sell()方法进行了增强）
     * @param args
     */
    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
