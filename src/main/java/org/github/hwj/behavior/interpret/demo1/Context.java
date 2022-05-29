package org.github.hwj.behavior.interpret.demo1;

import java.util.HashMap;
import java.util.Map;

//环境类
public class Context {
    private final Map<Variable, Integer> map = new HashMap<>();

    public void assign(Variable var, Integer value) {
        map.put(var, value);
    }

    public int getValue(Variable var) {
        Integer value = map.get(var);
        return value;
    }
}