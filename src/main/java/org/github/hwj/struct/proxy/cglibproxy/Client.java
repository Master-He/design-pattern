package org.github.hwj.struct.proxy.cglibproxy;

//测试类
public class Client {
    public static void main(String[] args) {
        //获取代理对象
        ProxyFactory factory = new ProxyFactory();
        TrainStation proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }
}