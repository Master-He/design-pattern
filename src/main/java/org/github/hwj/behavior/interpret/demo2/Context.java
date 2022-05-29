package org.github.hwj.behavior.interpret.demo2;

public class Context {
    private final Expression freeRideCitizen;

    public Context() {
        Expression city = new TerminalExpression("韶关", "广州");
        Expression person = new TerminalExpression("老人", "妇女", "儿童");
        freeRideCitizen = new NonTerminalExpression(city, person);
    }

    public void isFreeRide(String info) {
        if (freeRideCitizen.interpret(info)) {
            System.out.println("您是" + info + "，您本次乘车免费！");
        } else {
            System.out.println(info + "，您不是免费人员，本次乘车扣费2元！");
        }
    }
}
