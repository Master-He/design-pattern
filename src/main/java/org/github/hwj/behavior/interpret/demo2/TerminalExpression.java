package org.github.hwj.behavior.interpret.demo2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TerminalExpression implements Expression {

    private final Set<String> set = new HashSet<>();

    public TerminalExpression(String... data) {
        set.addAll(Arrays.asList(data));
    }

    @Override
    public boolean interpret(String info) {
        return set.contains(info);
    }
}
