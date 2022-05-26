package org.github.hwj.behavior.state.demo2;


public class LiftRunState implements LiftState {
    @Override
    public void open(Context context) {
        System.out.println("电梯运行着，不能开门，太危险了！");
    }

    @Override
    public void close(Context context) {
        System.out.println("电梯运行着，本来就是关着门的！");
    }

    @Override
    public void run(Context context) {
        System.out.println("电梯本来就运行着！");
    }

    @Override
    public void stop(Context context) {
        System.out.println("电梯停止运行！");
        context.setState(Context.STOP_STATE);
    }

    @Override
    public String toString() {
        return "电梯：运行状态";
    }
}
