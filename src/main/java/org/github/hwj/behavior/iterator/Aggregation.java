package org.github.hwj.behavior.iterator;

public interface Aggregation<T> {
    void add(T obj);
    void remove(T obj);
    Iterator<T> getIterator();
}
