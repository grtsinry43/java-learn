package com.grtsinry43.object_;

public class EqualsExercise02 {
    public static void main(String[] args) {
        Thing thing1 = new Thing("grtsinry43");
        Thing thing2 = new Thing("grtsinry43");
        System.out.println(thing1 == thing2);
        System.out.println(thing1.name.equals(thing2.name));
        System.out.println(thing1.equals(thing2));
        String str1 = new String("asdf");
        String str2 = new String("asdf");
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
    }
}
class Thing {
    public String name;

    public Thing(String name) {
        this.name = name;
    }
}