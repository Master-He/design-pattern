package org.github.hwj.behavior.strategy;

public class Client {
    public static void main(String[] args) {
        System.out.println("=======春节=========");
        SalesMan salesManA = new SalesMan(new StrategyA());
        salesManA.salesManShow();

        System.out.println("=======双11=========");
        SalesMan salesManB = new SalesMan(new StrategyB());
        salesManB.salesManShow();

        System.out.println("========618========");
        SalesMan salesManC = new SalesMan(new StrategyC());
        salesManC.salesManShow();

    }
}
