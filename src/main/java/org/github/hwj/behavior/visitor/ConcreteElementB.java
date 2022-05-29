package org.github.hwj.behavior.visitor;

public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
//        System.out.println(getClass().getSimpleName() + "被" + visitor.getClass().getSimpleName() + "访问");
//        System.out.println();
    }

    public String operationB() {
        return "方法B";
    }
}
