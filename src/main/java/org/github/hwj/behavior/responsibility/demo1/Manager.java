package org.github.hwj.behavior.responsibility.demo1;

public class Manager extends Handler {

    public Manager() {
        super(Handler.ONE_DAY, Handler.THREE_DAY);
    }

    @Override
    public void handleRequest(RequestLeave requestLeave) {
        System.out.println(requestLeave.getName() + "请假" + requestLeave.getNumberOfDay() + "天");
        System.out.println("经理同意请假");
    }
}
