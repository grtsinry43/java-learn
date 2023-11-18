package com.grtsinry43.object_;

public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("bmw");
        bmw = null;
        //主动调用垃圾回收器
        System.gc();
        System.out.println("456");
    }
}
class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }
    //重写finalize
    @Override
    protected void finalize() throws Throwable {
        System.out.println("123");
    }
}
