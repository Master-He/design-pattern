package org.github.hwj.behavior.observer.demo1;

public class SubscriptionObserver implements Observer {

    private final String name;

    public SubscriptionObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " get new message: " + message);
    }
}
