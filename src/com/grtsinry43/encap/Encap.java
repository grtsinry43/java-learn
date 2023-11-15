package com.grtsinry43.encap;


public class Encap {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.setName("jackdfsf");
//        p1.setAge(133);
//        p1.setSalary(30000);
//        System.out.println(p1.info());
        Person p2 = new Person("Smith23456789",12,2000);
        System.out.println(p2.info());
    }
}

class Person{
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6){
            this.name = name;
        } else {
            System.out.println("输入有误");
            this.name = null;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120){
            this.age = age;
        } else {
            System.out.println("输入有误");
            this.age = 18;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String info(){
        return "信息为" + name + " " + age + " " + salary;
    }
}