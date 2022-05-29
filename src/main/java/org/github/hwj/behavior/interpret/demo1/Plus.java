package org.github.hwj.behavior.interpret.demo1;

//非终结符表达式角色  加法表达式
public class Plus implements Expression {
    private final Expression left;
    private final Expression right;

    public Plus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }

    @Override
    public String toString() {
        return left.toString() + " + " + right.toString();
    }
}