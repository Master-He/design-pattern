package org.github.hwj.behavior.mediator.demo2;


import java.util.LinkedList;
import java.util.List;

public class SingletonMediator {
    private SingletonMediator() {

    }

    private final static SingletonMediator SINGLETON_MEDIATOR = new SingletonMediator();

    private final List<Colleague> colleagues = new LinkedList<>();

    public static SingletonMediator getMediator() {
        return SINGLETON_MEDIATOR;
    }

    public void register(Colleague colleague) {
        if(!colleagues.contains(colleague)) {
            colleagues.add(colleague);
        }
    }

    public void relay(Colleague colleague) {
        for (Colleague obj : colleagues) {
            if (!obj.equals(colleague)) {
                obj.receive();
            }
        }
    }
}
