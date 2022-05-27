package org.github.hwj.behavior.mediator.demo2;

//具体同事类
public class ConcreteColleague3 implements Colleague {

    public ConcreteColleague3() {
        SingletonMediator.getMediator().register(this);
    }

    public void receive() {
        System.out.println("具体同事类3收到请求。");
    }

    public void send() {
        System.out.println("具体同事类3发出请求。");
        SingletonMediator.getMediator().relay(this);
    }
}