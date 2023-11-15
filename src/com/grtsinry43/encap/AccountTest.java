package com.grtsinry43.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jack");
        account.setBalance(60);
        account.setPasswd("123456");
        account.showinfo();
    }
}
