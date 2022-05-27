package org.github.hwj.behavior.mediator.demo1;

import java.util.LinkedList;
import java.util.List;

//具体中介者
class ConcreteMediator implements Mediator {
    private final List<Colleague> colleagues = new LinkedList<>();
    public void register(Colleague colleague) {
        // 这里互相依赖相当于同事和中介互相留了联系方式
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
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