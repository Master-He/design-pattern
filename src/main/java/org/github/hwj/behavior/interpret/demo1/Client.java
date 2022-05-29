package org.github.hwj.behavior.interpret.demo1;

//测试类
public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        Variable e = new Variable("e");

        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);
        context.assign(e, 5);

        Expression Expression = new Minus(new Plus(new Plus(new Plus(a, b), c), d), e);

        System.out.println(Expression + " = " + Expression.interpret(context));
    }
}