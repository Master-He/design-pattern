package org.github.hwj.behavior.state.demo1;

public class StateA implements State {

    private StateA() {

    }

    private static final StateA stateA = new StateA();

    public static StateA getStateA() {
        return stateA;
    }

    @Override
    public void handle(Context context) {
        System.out.println("当前状态是A状态， 正在转换成B状态");
        context.state = StateB.getStateB();
    }
}
