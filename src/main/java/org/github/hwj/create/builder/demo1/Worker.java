package org.github.hwj.create.builder.demo1;

public class Worker extends Builder {

    private final Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    void buildA() {
        System.out.println("地基");
        product.setA("地基");
    }

    @Override
    void buildB() {
        System.out.println("钢筋");
        product.setB("钢筋");
    }

    @Override
    void buildC() {
        System.out.println("水泥");
        product.setC("水泥");
    }

    @Override
    void buildD() {
        System.out.println("电线");
        product.setD("电线");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
