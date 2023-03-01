package com.example.test;

public class Peg {
    private String color;
    private int number;

    public Peg(String color, int num){
        this.color=color;
        number=num;
    }
    public Peg(){
        color="empty";
        number=0;
    }

    public int getNumber(){
        return number;
    }

    public String getColor(){
        return color;
    }
}
