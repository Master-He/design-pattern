package org.github.hwj.behavior.responsibility;

public class GeneralManger extends Handler {
    public GeneralManger() {
        super(Handler.THREE_DAY, Handler.SEVEN_DAY);
    }

    @Override
    public void handleRequest(RequestLeave requestLeave) {
        System.out.println(requestLeave.getName() + "请假" + requestLeave.getNumberOfDay() + "天");
        System.out.println("总经理同意请假");
    }
}
