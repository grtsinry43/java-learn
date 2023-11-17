package com.grtsinry43.poly_;


public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //使用多态机制可以统一管理
    public void feed(Animal animal,Food food){
        System.out.println("主人" + getName()  + "给" + animal.getName() + "喂" + food.getName());
    }
}
