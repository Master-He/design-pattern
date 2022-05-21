package org.github.hwj.create.prototype;

import java.io.*;
import java.util.Date;

public class Video implements Cloneable,Serializable{

    private String name;
    private Date date;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 递归地克隆属性
        Video video = (Video) super.clone();  // 先浅拷贝
        video.date = (Date) this.date.clone(); // 然后深拷贝

        return video;
    }

    /**
     * 序列化+反序列化实现深拷贝
     */
    public Object deepClone() {
        ByteArrayInputStream bis = null;
        ByteArrayOutputStream bos = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Video video = (Video) ois.readObject();

            return video;

        } catch (Exception ignored) {
            return null;
        }
        finally {
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (Exception ignored) {
            }

            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (Exception ignored) {
            }

            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (Exception ignored) {
            }

            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (Exception ignored) {
            }
        }
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
