package org.github.hwj.behavior.responsibility;

public class GroupLeader extends Handler {

    public GroupLeader() {
        super(0, Handler.ONE_DAY);
    }

    @Override
    public void handleRequest(RequestLeave requestLeave) {
        System.out.println(requestLeave.getName() + "请假" + requestLeave.getNumberOfDay() + "天");
        System.out.println("组长同意请假");
    }
}
