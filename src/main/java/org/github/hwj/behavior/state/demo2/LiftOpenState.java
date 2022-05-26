package org.github.hwj.behavior.state.demo2;


public class LiftOpenState implements LiftState {
    @Override
    public void open(Context context) {
        System.out.println("电梯门已经开着了,兄弟！");
    }

    @Override
    public void close(Context context) {
        System.out.println("电梯门关闭！");
        context.setState(Context.CLOSE_STATE);
    }

    @Override
    public void run(Context context) {
        System.out.println("电梯门还开着呢？能运行吗？兄弟！");
    }

    @Override
    public void stop(Context context) {
        System.out.println("其实开门就是电梯停止了，兄弟");
    }

    @Override
    public String toString() {
        return "电梯：开门状态";
    }
}
