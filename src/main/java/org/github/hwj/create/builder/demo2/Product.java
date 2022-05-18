package org.github.hwj.create.builder.demo2;

public class Product {
    private String A = "汉堡";
    private String B = "可乐";
    private String C = "薯条";
    private String D = "甜点";

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public String getC() {
        return C;
    }

    public void setC(String c) {
        C = c;
    }

    public String getD() {
        return D;
    }

    public void setD(String d) {
        D = d;
    }

    @Override
    public String toString() {
        return "Product{" +
            "A='" + A + '\'' +
            ", B='" + B + '\'' +
            ", C='" + C + '\'' +
            ", D='" + D + '\'' +
            '}';
    }
}
