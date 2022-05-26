package org.github.hwj.behavior.state.demo2;

public class Context {
    public static final LiftState RUN_STATE = new LiftRunState();
    public static final LiftState STOP_STATE = new LiftStopState();
    public static final LiftState OPEN_STATE = new LiftOpenState();
    public static final LiftState CLOSE_STATE = new LiftCloseState();

    private LiftState state;

    public LiftState getState() {
        return state;
    }

    public void setState(LiftState state) {
        this.state = state;
    }

    public Context() {
        setState(CLOSE_STATE);
    }

    public void open() {
        state.open(this);
    }

    public void close() {
        state.close(this);
    }

    public void run() {
        state.run(this);
    }

    public void stop() {
        state.stop(this);
    }

}
