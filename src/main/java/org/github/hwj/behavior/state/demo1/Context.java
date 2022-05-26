package org.github.hwj.behavior.state.demo1;

public class Context {
    public State state;

    public Context() {
        state = StateA.getStateA();
    }

    public void handle() {
        state.handle(this);
    }
}
