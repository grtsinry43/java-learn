package com.grtsinry43.poly_.polyparameter;

public class Worker extends Employee {
    public Worker(String name,double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("打工人" + getName() + "正在苦逼工作");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}