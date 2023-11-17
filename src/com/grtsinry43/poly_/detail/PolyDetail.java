package com.grtsinry43.poly_.detail;

public class PolyDetail {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.cry();
//        animal.catchMouse();
        //在编译阶段能调用哪些属性是由编译类型决定
        //最终运行效果取决于子类（运行类型）
        animal.test();
        Cat cat = (Cat) animal;
        cat.cry();
        cat.catchMouse();
        System.out.println(cat instanceof Animal);
    }
}
