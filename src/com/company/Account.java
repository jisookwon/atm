package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private String accntNum;
    private String name;
    private float bal;
    private int pin;

    public void setAccntNum(String accntNum){
        this.accntNum=accntNum;
    }

    public String getAccntNum(){
        return accntNum;
    }

    public void setUserName(String name){
        this.name=name;
    }

    public String getUserName(){
        return name;
    }

    public void setBal(float bal){
        this.bal=bal;
    }

    public float getBal(){
        return bal;
    }

    public void setPin(int pin){
        this.pin=pin;
    }

    public int getPin(){
        return pin;
    }
}
