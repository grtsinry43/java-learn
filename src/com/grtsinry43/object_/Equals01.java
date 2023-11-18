package com.grtsinry43.object_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);
        System.out.println("hello".equals("abc"));
//        Integer integer1 = new Integer(1000);
//        Integer integer2 = new Integer(1000);
//        System.out.println(integer1 == integer2);
//        System.out.println(integer1.equals(integer2));
        String str1 = new String("grtsinry43");
        String str2 = new String("grtsinry43");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
class A{

}
