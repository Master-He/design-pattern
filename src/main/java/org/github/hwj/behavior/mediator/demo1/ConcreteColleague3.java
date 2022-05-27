package org.github.hwj.behavior.mediator.demo1;

//具体同事类
class ConcreteColleague3 implements Colleague {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }


    public void receive() {
        System.out.println("具体同事类3收到请求。");
    }

    public void send() {
        System.out.println("具体同事类3发出请求。");
        mediator.relay(this); //请中介者转发
    }
}