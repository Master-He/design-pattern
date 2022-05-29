package org.github.hwj.behavior.visitor;

public interface Element {
    void accept(Visitor visitor);
}
