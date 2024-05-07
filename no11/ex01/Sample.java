package ex01;

import java.lang.reflect.Method;

public class Sample {
    public static void main(String[] args) throws Exception {
        Object obj = Factory.create();
        // インスタンスからもとになったクラスの定義情報を取り出す。
        Class clazz = obj.getClass();
        // クラスの定義情報からすべてのメソッドの定義情報を取り出す
        Method[] methods = clazz.getDeclaredMethods();
        // メソッドの定義情報をもとにインスタンスのメソッドを取り出す。
        for (Method m : methods) {
            System.out.println(m.invoke(obj));
        }
    }
}
