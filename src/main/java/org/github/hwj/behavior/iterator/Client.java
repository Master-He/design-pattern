package org.github.hwj.behavior.iterator;

public class Client {
    public static void main(String[] args) {
        ConcreteAggregation<String> stringAggregation = new ConcreteAggregation<>();
        stringAggregation.add("a");
        stringAggregation.add("b");
        stringAggregation.add("c");
        Iterator<String> stringIterator = stringAggregation.getIterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }

        ConcreteAggregation<Integer> integerAggregation = new ConcreteAggregation<>();
        integerAggregation.add(1);
        integerAggregation.add(2);
        integerAggregation.add(3);
        Iterator<Integer> integerIterator = integerAggregation.getIterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }

    }
}
