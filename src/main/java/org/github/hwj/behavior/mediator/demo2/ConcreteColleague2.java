package org.github.hwj.behavior.mediator.demo2;

//具体同事类
public class ConcreteColleague2 implements Colleague {

    public ConcreteColleague2() {
        SingletonMediator.getMediator().register(this);
    }

    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }

    public void send() {
        System.out.println("具体同事类2发出请求。");
        SingletonMediator.getMediator().relay(this);
    }
}