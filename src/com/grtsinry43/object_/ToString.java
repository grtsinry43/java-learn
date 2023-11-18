package com.grtsinry43.object_;

public class ToString {
    public static void main(String[] args) {
        Monster monster = new Monster("xiao", "xunshan", 1000);
        System.out.println(monster.toString() + " " + monster.hashCode());
        System.out.println(monster);
    }
}
class Monster{
    private String name;
    private String job;
    private double salary;

    public Monster(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }
    //重写ToString方法

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}
