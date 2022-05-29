package org.github.hwj.behavior.visitor;

public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
//        System.out.println(getClass().getSimpleName() + "被" + visitor.getClass().getSimpleName() + "访问");
//        System.out.println();
    }

    public String operationA() {
        return "方法A";
    }
}
