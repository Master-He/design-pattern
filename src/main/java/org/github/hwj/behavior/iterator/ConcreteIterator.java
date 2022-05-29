package org.github.hwj.behavior.iterator;

import java.util.List;

public class ConcreteIterator<T> implements Iterator<T> {

    private final List<T> list;
    private int index = -1;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() - 1 ){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public T next() {
        if (this.hasNext()) {
            return list.get(++index);
        } else {
            return null;
        }
    }
}
