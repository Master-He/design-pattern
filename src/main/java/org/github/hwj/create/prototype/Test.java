package org.github.hwj.create.prototype;

import com.sun.xml.internal.ws.util.xml.CDATA;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 实现深克隆的办法有：
        //  1.重写克隆方法，递归地克隆属性
        //  2.通过序列化和反序列化实现深克隆

        // 1.重写克隆方法，递归地克隆属性
        Date date = new Date(1653098517268L);
        Video v1 = new Video("设计模式", date);
        Video v2 = (Video) v1.clone();
        Video v3 = (Video) v1.deepClone();  // 使用序列化方法， 注意，Video需要implements Serializable
        Video v4 = Utils.deepClone(v1); // 封装了序列化方法为工具类

        // 结果相同
        System.out.println("v1 ==> " + v1); // v1 ==> Video{name='设计模式', date=Sat May 21 10:01:57 CST 2022}
        System.out.println("v2 ==> " + v2); // v2 ==> Video{name='设计模式', date=Sat May 21 10:01:57 CST 2022}
        System.out.println("v3 ==> " + v3); // v3 ==> Video{name='设计模式', date=Sat May 21 10:01:57 CST 2022}
        System.out.println("v4 ==> " + v4); // v3 ==> Video{name='设计模式', date=Sat May 21 10:01:57 CST 2022}

        // 直接修改v1的date属性， 注意不能v1.setDate(new Date(1553098517268L)), 因为这是换了一个新的date，而不是修改date
        date.setTime(1553098517268L);
        v1.setName("设计模式-原型");
        v2.getDate().setTime(1453098517268L);

        // v1修改属性不影响v2, v3, v4  v2修改属性也不影响v3, v4
        System.out.println("v1 ==> " + v1); // v1 ==> Video{name='设计模式-原型', date=Thu Mar 21 00:15:17 CST 2019}
        System.out.println("v2 ==> " + v2); // v2 ==> Video{name='设计模式', date=Mon Jan 18 14:28:37 CST 2016}
        System.out.println("v3 ==> " + v3); // v3 ==> Video{name='设计模式', date=Sat May 21 10:01:57 CST 2022}
        System.out.println("v4 ==> " + v4); // v3 ==> Video{name='设计模式', date=Sat May 21 10:01:57 CST 2022}

    }
}
