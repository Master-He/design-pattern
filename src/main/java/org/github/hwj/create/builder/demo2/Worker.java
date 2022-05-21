package org.github.hwj.create.builder.demo2;

public class Worker extends Builder{

    private final Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    public Builder buildA(String A) {
        product.setA(A);
        return this;
    }

    @Override
    public Builder buildB(String B) {
        product.setB(B);
        return this;
    }

    @Override
    public Builder buildC(String C) {
        product.setC(C);
        return this;
    }

    @Override
    public Builder buildD(String D) {
        product.setD(D);
        return this;
    }

    @Override
    public Product build() {
        return product;
    }
}
