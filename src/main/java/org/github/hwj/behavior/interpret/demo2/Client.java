package org.github.hwj.behavior.interpret.demo2;

public class Client {
    public static void main(String[] args) {
        // 例子来自 C语言中文网， 链接： http://c.biancheng.net/view/1402.html
        /*文法规则
          <expression> ::= <city>的<person>
          <city> ::= 韶关|广州
          <person> ::= 老人|妇女|儿童
        */
        Context bus = new Context();
        bus.isFreeRide("韶关的老人");
        bus.isFreeRide("韶关的年轻人");
        bus.isFreeRide("广州的妇女");
        bus.isFreeRide("广州的儿童");
        bus.isFreeRide("山东的儿童");
    }
}
