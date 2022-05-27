package org.github.hwj.behavior.mediator.demo1;

//抽象中介者
public interface Mediator {
    void register(Colleague colleague);
    void relay(Colleague colleague); //转发
}