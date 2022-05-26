package org.github.hwj.behavior.state.demo1;

public class StateB implements State {

    private StateB() {

    }

    private static final StateB stateB = new StateB();

    public static StateB getStateB() {
        return stateB;
    }

    @Override
    public void handle(Context context) {
        System.out.println("当前状态是B状态， 正在转换成A状态");
        context.state = StateA.getStateA();
    }
}
