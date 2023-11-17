package com.grtsinry43.poly_.exercise_;

public class PolyExercise02 {
    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println(sub.count);
        sub.display();
        Base b  = sub;
        System.out.println(b == sub);
        System.out.println(b.count);
        b.display();
    }
}
class Base{
    int count = 10;

    public void display() {
        System.out.println(this.count);
    }
}
class Sub extends Base{
    int count = 20;
    public void display() {
        System.out.println(this.count);
    }
}
