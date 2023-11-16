package com.grtsinry43.super_;

public class B extends A {
    public int n1 = 111;
    public void say() {
        System.out.println(super.n1);
        System.out.println(super.n2);
        System.out.println(super.n3);
//        System.out.println(super.n4);
        super.test100();
        super.test200();
        super.test300();
    }
    public void sum(){
        System.out.println("B sum()");
        cal();
        super.cal();
        this.cal();
        System.out.println(super.n1);
    }
}