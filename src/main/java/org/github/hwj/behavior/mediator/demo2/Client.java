package org.github.hwj.behavior.mediator.demo2;


public class Client {
    public static void main(String[] args) {
        // 简化的中介模式，把中介弄成单例，然后创建同事对象的时候，将它弄进中介的名单里

        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1();
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2();
        ConcreteColleague3 concreteColleague3 = new ConcreteColleague3();

        concreteColleague1.send();
        System.out.println("-------------");
        concreteColleague2.send();
        System.out.println("-------------");
        concreteColleague3.send();
    }
}