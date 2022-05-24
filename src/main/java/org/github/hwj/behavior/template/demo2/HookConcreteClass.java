package org.github.hwj.behavior.template.demo2;

//含钩子方法的具体子类
class HookConcreteClass extends HookAbstractClass {
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
    public void HookMethod1() {
        System.out.println("钩子方法1被重写...");
    }
    public boolean HookMethod2() {
        return true;
    }
}