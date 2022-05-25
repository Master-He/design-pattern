package org.github.hwj.behavior.command.demo2;


public class Client {
    public static void main(String[] args) {

        // 创建服务员
        Waiter waiter = new Waiter();
        // 创建菜品（命令）
        Breakfast food1 = new ChangFen();
        Breakfast food2 = new HunTun();
        Breakfast food3 = new HeFen();
        // 服务员设置菜单
        waiter.setChangFen(food1);//设置肠粉菜单
        waiter.setHunTun(food2);  //设置河粉菜单
        waiter.setHeFen(food3);   //设置馄饨菜单

        // 服务员下达做菜命令
        waiter.orderChangFen();  //选择肠粉
        waiter.orderHeFen();     //选择河粉
        waiter.orderHunTun();    //选择馄饨
    }
}