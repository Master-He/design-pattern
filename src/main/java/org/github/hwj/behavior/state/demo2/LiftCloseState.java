package org.github.hwj.behavior.state.demo2;


public class LiftCloseState implements LiftState {
    @Override
    public void open(Context context) {
        System.out.println("电梯门打开！");
        context.setState(Context.OPEN_STATE);
    }

    @Override
    public void close(Context context) {
        System.out.println("电梯门已经关闭了,兄弟！");
    }

    @Override
    public void run(Context context) {
        System.out.println("电梯运行，请站好扶稳！");
        context.setState(Context.RUN_STATE);
    }

    @Override
    public void stop(Context context) {
        System.out.println("电梯停止运行！");  // 确实可以关着门不运行电梯
        context.setState(Context.STOP_STATE);
    }

    @Override
    public String toString() {
        return "电梯：关门状态";
    }
}
