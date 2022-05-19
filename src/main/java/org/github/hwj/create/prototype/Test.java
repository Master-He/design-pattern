package org.github.hwj.create.prototype;

import com.sun.xml.internal.ws.util.xml.CDATA;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 实现深克隆的办法有：
        //  1.重写克隆方法，递归地克隆属性
        //  2.通过序列化和反序列化实现深克隆

        // 1.重写克隆方法，递归地克隆属性
        Date date = new Date();
        Video v1 = new Video("设计模式", date);
        Video v2 = (Video) v1.clone();

        // 结果相同
        System.out.println("v1 ==> " + v1);
        System.out.println("v2 ==> " + v2);

        date.setTime(1231231232);
        v1.setName("设计模式-原型");

        // 结果不同
        System.out.println("v1 ==> " + v1);
        System.out.println("v2 ==> " + v2);


        // todo 2.通过序列化和反序列化实现深克隆
    }
}
