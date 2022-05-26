package org.github.hwj.behavior.state.demo2;


public class LiftStopState implements LiftState {
    @Override
    public void open(Context context) {
        System.out.println("电梯门开了！");
        context.setState(Context.OPEN_STATE);
    }

    @Override
    public void close(Context context) {
        System.out.println("电梯门关了！");
        context.setState(Context.CLOSE_STATE);
    }

    @Override
    public void run(Context context) {
        System.out.println("电梯运行！");
        context.setState(Context.RUN_STATE);
    }

    @Override
    public void stop(Context context) {
        System.out.println("电梯本来就是停止的！");
    }

    @Override
    public String toString() {
        return "电梯：停止状态";
    }
}
