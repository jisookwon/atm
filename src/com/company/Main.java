package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);

            Account acct1 = new Account();
            acct1.setAccntNum("1234567");
            acct1.setUserName("Tim");
            acct1.setBal(2000);
            acct1.setPin(1111);

            Account acct2 = new Account();
            acct2.setAccntNum("2345678");
            acct2.setUserName("Tosin");
            acct2.setBal(3000);
            acct2.setPin(2222);

            Account acct3 = new Account();
            acct3.setAccntNum("3456789");
            acct3.setUserName("Jin");
            acct3.setBal(4000);
            acct3.setPin(3333);

            ATM atm = new ATM();
            atm.addAccount(acct1);
            atm.addAccount(acct2);
            atm.addAccount(acct3);
            atm.doATM();
    }
}


