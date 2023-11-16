package com.grtsinry43.override;

public class OverrideExercise {
    public static void main(String[] args) {
        Person jack = new Person("jack", 20);
        System.out.println(jack.say());
        Student mary = new Student("Mary", 22, 12345, 60);
        System.out.println(mary.say());

    }
}
