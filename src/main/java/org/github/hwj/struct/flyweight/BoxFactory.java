package org.github.hwj.struct.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BoxFactory {
    private final Map<String, AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    private static BoxFactory boxFactory = new BoxFactory();

    public static BoxFactory getInstance() {
        return boxFactory;
    }

    public AbstractBox getBox(String shape) {
        return map.get(shape);
    }
}
