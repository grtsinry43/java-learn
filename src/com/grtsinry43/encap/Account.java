package com.grtsinry43.encap;

public class Account {
    private String name;
    private double balance;
    private String passwd;

    public Account() {
    }

    public Account(String name, double balance, String passwd) {
        this.name = name;
        this.balance = balance;
        this.passwd = passwd;
        setName(name);
        setBalance(balance);
        setPasswd(passwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4){
            this.name = name;
        } else {
            System.out.println("姓名的输入有误");
            this.name = null;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 20){
            this.balance = balance;
        } else {
            System.out.println("余额输入有误");
            this.balance = 0;
        }

    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        if (passwd.length() == 6){
            this.passwd = passwd;
        } else {
            System.out.println("密码必须六位，默认密码000000");
            this.passwd = "000000";
        }
    }
    public void showinfo(){
        System.out.println("信息 " + name + " " + balance);
    }
}