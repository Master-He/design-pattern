package org.github.hwj.behavior.responsibility;

public class Employee {
    public static void main(String[] args) {

        GeneralManger generalManger = new GeneralManger();
        Manager manager = new Manager();
        GroupLeader groupLeader = new GroupLeader();
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManger);

        RequestLeave requestLeave1 = new RequestLeave("特朗普", 1);
        groupLeader.receiveRequest(requestLeave1);
        System.out.println("===================");

        RequestLeave requestLeave2 = new RequestLeave("普京", 2);
        groupLeader.receiveRequest(requestLeave2);
        System.out.println("===================");

        RequestLeave requestLeave3 = new RequestLeave("奥巴马", 4);
        groupLeader.receiveRequest(requestLeave3);
        System.out.println("===================");

        RequestLeave requestLeave4 = new RequestLeave("拜登", 8);
        groupLeader.receiveRequest(requestLeave4);
        System.out.println("===================");
    }
}
