package org.github.hwj.behavior.visitor;

public class ConcreteVisitorB implements Visitor {
    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println(getClass().getSimpleName() +
                "调用" + concreteElementA.getClass().getSimpleName() +
                "的" + concreteElementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println(getClass().getSimpleName() +
                "调用" + concreteElementB.getClass().getSimpleName() +
                "的" + concreteElementB.operationB());
    }
}
