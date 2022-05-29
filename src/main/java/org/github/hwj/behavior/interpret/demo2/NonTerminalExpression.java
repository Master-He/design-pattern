package org.github.hwj.behavior.interpret.demo2;

public class NonTerminalExpression implements Expression{
    private final Expression city;
    private final Expression person;

    public NonTerminalExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String[] s = info.split("的");
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}
