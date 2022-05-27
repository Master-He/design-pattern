package org.github.hwj.behavior.observer.demo1;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notify(String message);
}
