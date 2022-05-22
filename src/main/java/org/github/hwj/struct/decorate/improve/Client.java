package org.github.hwj.struct.decorate.improve;

public class Client {
    /**
     * base包下的是基础版本，和improve包下的思想，做法其实是一模一样的， 只是improve对一些东西进行了删减，抽象
     * improve版更好理解，毕竟是自己理解下改进的，而base版是参考教程的
     */
    public static void main(String[] args) {
        FastFood fastFood = new FiredRices();  // 10元
        fastFood = new Egg(fastFood); // 加1元
        fastFood = new Egg(fastFood); // 加1元
        fastFood = new Bacon(fastFood); // 加2元
        System.out.println(fastFood.getDesc() + "花费了" + fastFood.getPrice() + "元"); // 炒饭加鸡蛋加鸡蛋加培根花费了14.0元

        fastFood = new Bacon(new Egg(new FiredNoodles()));  // 12+1+3元
        System.out.println(fastFood.getDesc() + "花费了" + fastFood.getPrice() + "元"); // 炒面加鸡蛋加培根花费了15.0元
    }
}
