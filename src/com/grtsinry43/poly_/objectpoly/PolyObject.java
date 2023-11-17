package com.grtsinry43.poly_.objectpoly;

public class PolyObject {
    public static void main(String[] args) {
        Animal animal = new Dog();
        //编译类型      //运行类型
        animal.cry(); //运行类型是Dog
        animal = new Cat();
        animal.cry();
    }
}
