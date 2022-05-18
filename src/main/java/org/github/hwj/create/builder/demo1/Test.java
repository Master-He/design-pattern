package org.github.hwj.create.builder.demo1;

public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Product house = director.build(new Worker());
        System.out.println(house);  // Product{A='地基', B='钢筋', C='水泥', D='电线'}
    }
}
