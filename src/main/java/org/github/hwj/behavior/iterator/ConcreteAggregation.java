package org.github.hwj.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregation<T> implements Aggregation<T> {

    private final List<T> list = new ArrayList<>();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public Iterator<T> getIterator() {
        return new ConcreteIterator<>(list);
    }
}
