package org.github.hwj.behavior.mediator.demo1;

//抽象同事类
public interface Colleague {
    void setMediator(Mediator mediator);

    void receive();

    void send();
}