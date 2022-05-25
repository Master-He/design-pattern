package org.github.hwj.behavior.responsibility.demo1;

public abstract class Handler {
    protected static final int ONE_DAY = 1;
    protected static final int THREE_DAY = 3;
    protected static final int SEVEN_DAY = 7;

    private final int numStart;
    private final int numEnd;

    private Handler nextHandler;

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    public abstract void handleRequest(RequestLeave requestLeave);

    public void receiveRequest(RequestLeave requestLeave) {
        if (requestLeave.getNumberOfDay() > numStart && requestLeave.getNumberOfDay() <=numEnd) {
            handleRequest(requestLeave);
            System.out.println("流程结束");
        } else if (nextHandler != null) {
            nextHandler.receiveRequest(requestLeave);
        } else {
            System.out.println(requestLeave.getName() + "请假" + requestLeave.getNumberOfDay() + "天");
            System.out.println("请假系统： 你想离职？");
            System.out.println("流程结束");
        }

    }

}
