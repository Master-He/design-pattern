package org.github.hwj.behavior.mediator.demo2;

//具体同事类
public class ConcreteColleague1 implements Colleague {

    public ConcreteColleague1() {
        SingletonMediator.getMediator().register(this);
    }

    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }

    public void send() {
        System.out.println("具体同事类1发出请求。");
        SingletonMediator.getMediator().relay(this);
    }
}