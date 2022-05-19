package org.github.hwj.create.prototype;

import java.util.Date;

public class Video implements Cloneable {

    private String name;
    private Date date;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();

        // 递归地克隆属性
        Video video = (Video) obj;
        video.date = (Date) this.date.clone();

        return obj;
    }

    public Video() {
    }

    public Video(String name, Date date) {
        // 创建的过程比较耗时，或者比较复杂，然后又需要重复创建，就使用克隆，这就是原型模式
        // 比如创建的过程需要连接数据库，需要加载什么学习模型什么的。
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Video{" +
            "name='" + name + '\'' +
            ", date=" + date +
            '}';
    }
}
