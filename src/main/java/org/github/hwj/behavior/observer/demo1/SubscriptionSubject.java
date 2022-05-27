package org.github.hwj.behavior.observer.demo1;

import java.util.LinkedList;
import java.util.List;

public class SubscriptionSubject implements Subject {

    private final List<Observer> observers = new LinkedList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
