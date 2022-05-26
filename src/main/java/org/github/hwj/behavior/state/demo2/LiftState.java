package org.github.hwj.behavior.state.demo2;

public interface LiftState {
    void open(Context context); //开门

    void close(Context context); //关门

    void run(Context context); //运行

    void stop(Context context); //停止
}
