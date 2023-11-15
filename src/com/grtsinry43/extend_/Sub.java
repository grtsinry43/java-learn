package com.grtsinry43.extend_;

public class Sub extends Base{
    public Sub(){
        super("234");
        System.out.println("sub构造器调用");
    }
    public Sub(String name){
        super("123",12);
        System.out.println("子类二构造器被调用");
    }
}
