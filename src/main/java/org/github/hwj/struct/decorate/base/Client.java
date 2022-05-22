package org.github.hwj.struct.decorate.base;

public class Client {
    /**
     * base包下的是基础版本，和improve包下的思想，做法其实是一模一样的， 只是improve对一些东西进行了删减，抽象
     * improve版更好理解，毕竟是自己理解下改进的，而base版是参考教程的
     */
    public static void main(String[] args) {
        FastFood fastFood = new FiredRices();
        System.out.println(fastFood.getDesc() + "花费了" + fastFood.cost() + "元");

        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getDesc() + "花费了" + fastFood.cost() + "元");

        fastFood = new Egg(fastFood);
        System.out.println(fastFood.getDesc() + "花费了" + fastFood.cost() + "元");

        fastFood = new Bacon(fastFood);
        System.out.println(fastFood.getDesc() + "花费了" + fastFood.cost() + "元");

        fastFood = new Bacon(fastFood);
        System.out.println(fastFood.getDesc() + "花费了" + fastFood.cost() + "元");
    }
}
