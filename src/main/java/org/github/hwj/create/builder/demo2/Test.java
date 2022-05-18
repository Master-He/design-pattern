package org.github.hwj.create.builder.demo2;

public class Test {
    public static void main(String[] args) {
        // 产品套餐的默认值
        Worker worker = new Worker();
        Product product = worker.getProduct();
        System.out.println(product); // Product{A='汉堡', B='可乐', C='薯条', D='甜点'}

        // 自选套餐组成
        Product product1 = worker.buildA("香辣鸡翅")
            .buildB("冰淇淋")
            .buildC("红豆沙")
            .buildD("蜜汁鸡腿")
            .getProduct();
        System.out.println(product1);
    }
}
