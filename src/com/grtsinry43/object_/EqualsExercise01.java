package com.grtsinry43.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("jack", 20, '男');
        Person person2 = new Person("smith", 20, '男');
        System.out.println(person1.equals(person2));
    }
}
class Person{
    private String name;
    private int age;
    private char gender;

    //重写Object的equals方法
    public boolean equals(Object obj){
        //同一个对象直接返回true
        if (this == obj){
            return true;
        }
        //同类比较属性
        if (obj instanceof Person){
            //向下转型
            Person person = (Person) obj;
            return this.name.equals(person.name)
                    && this.age == person.age
                    && this.gender == person.gender;
        }

        return false;

    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}