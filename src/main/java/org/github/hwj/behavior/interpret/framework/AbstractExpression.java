package org.github.hwj.behavior.interpret.framework;

//抽象表达式类
interface AbstractExpression {
    void interpret(Context ctx);  //解释方法
}

//终结符表达式类
class TerminalExpression implements AbstractExpression {
    public void interpret(Context ctx) {
        //对终结符表达式的处理
    }
}

//非终结符表达式类
class NonTerminalExpression implements AbstractExpression {
    private AbstractExpression exp1;
    private AbstractExpression exp2;

    public void interpret(Context ctx) {
        //非对终结符表达式的处理
    }
}

//环境类
class Context {
    private AbstractExpression exp;

    public Context() {
        //数据初始化
    }

    public void operation(String info) {
        //调用相关表达式类的解释方法
    }
}