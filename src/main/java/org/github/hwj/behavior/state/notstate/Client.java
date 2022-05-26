package org.github.hwj.behavior.state.notstate;

public class Client {
    public static void main(String[] args) {
        // 非状态模式案例
        Lift lift = new Lift();
        lift.setState(ILift.STOPPING_STATE);//电梯是停止的
        lift.open();//开门
        lift.close();//关门
        lift.run();//运行
        lift.stop();//停止
    }
}