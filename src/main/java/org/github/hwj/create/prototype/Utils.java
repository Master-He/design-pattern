package org.github.hwj.create.prototype;

import java.io.*;

public class Utils {
    /**
     * 注意，使用此方法的对象要实现序列化接口
     */
    @SuppressWarnings("unchecked")
    public static <T> T deepClone(T obj) {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        T clonedObj = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(obj);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            clonedObj = (T) ois.readObject();

        } catch (Exception ignored) {

        } finally {
            closeQuietly(ois, bis, oos, bos);
        }

        return clonedObj;
    }

    public static void closeQuietly(Closeable... closeables) {
        if (closeables != null) {
            for (Closeable closeable : closeables) {
                closeQuietly(closeable);
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (Exception ignored) {

        }
    }

}
