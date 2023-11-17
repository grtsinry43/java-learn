package com.grtsinry43.poly_.dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
        //方法会动态绑定，找运行类型
        //属性，不会，哪里声明哪里使用，也就是可能使用的属性不再运行类型中
    }
}
