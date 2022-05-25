package org.github.hwj.behavior.responsibility;

public class RequestLeave {
    private final String name;
    private final int numberOfDay;

    public RequestLeave(String name, int numberOfDay) {
        this.name = name;
        this.numberOfDay = numberOfDay;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }
}
