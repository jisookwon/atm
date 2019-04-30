package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM extends Account {

    public ArrayList<Account> accounts;

    public ATM() {
        accounts = new ArrayList<>();
    }

    public void doATM() {
        String accntNum, answer = "";
        int count = 0;
        double amount;
        int option;
        int increas, decrease = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your account number : ");
        accntNum = keyboard.nextLine();
        for (Account account : accounts) {
            if (account.getAccntNum().equalsIgnoreCase(accntNum)) {
                while (count < 3) {
                    System.out.println("Enter your PIN :");
                    int pin = keyboard.nextInt();
                    if (account.getPin() == pin) {
                        while (!answer.equalsIgnoreCase("n")) {
                            System.out.print("Enter the transaction (1-withdraw, 2-Deposit, 3-Check Balance) : ");
                            option = keyboard.nextInt();
                            switch (option) {
                                case 1:
                                    System.out.println("Enter the amount to withdraw : ");
                                    amount = keyboard.nextInt();
                                    withdraw(amount, account);
                                    break;
                                case 2:
                                    System.out.println("Enter the amount to deposit : ");
                                    amount = keyboard.nextInt();
                                    deposit(amount, account);
                                    System.out.println("your current balance is " + balance);
                                    break;
                                case 3:
                                    checkBalance(account);
                                    break;
                            }
                            keyboard.nextLine();
                            System.out.println("Do you like to do somethingelse(y/n)");
                            answer = keyboard.nextLine();
                        }
                    } else if (count < 2) {
                        System.out.println("Wrong PIN, Please try again");
                    } else {
                        System.out.println("The account has been locked");
                    }
                }//do while
            }//if
        }//for
    }//doAtm

public void addAccount(Account accnt){
    accounts.add(accnt);
    }

private void deposit(double amount, Account accnt){
    float balance=0;
    if (accounts.contains(accnt)){
        balance=accnt.getBal();
        balance-=amount;
        accnt.setBal(balance);
    }
    return balance;
}

private void checkBalance(Account accnt){
    if(accounts.contains(accnt)){
        System.out.printf("Current balance : $%d\n", accnt.getBal());
    }
}
private void transactions(Account accnt){

}
}