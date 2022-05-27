package org.github.hwj.behavior.observer.demo1;

public class Client {
    public static void main(String[] args) {
        Subject subject = new SubscriptionSubject();
        subject.attach(new SubscriptionObserver("特朗普"));
        subject.attach(new SubscriptionObserver("拜登"));
        subject.attach(new SubscriptionObserver("普京"));

        subject.notify("乌克兰加入北约。");
    }
}
