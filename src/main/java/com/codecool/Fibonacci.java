package com.codecool;

public class Fibonacci {

    static int prevNum = 1;
    static int prevPrevNum = 0;
    static int tempNum;

    Fibonacci () {
        tempNum = prevNum;
        prevNum += prevPrevNum;
        prevPrevNum = tempNum;
    }

    public int nextNum(){
        return prevPrevNum;
    }
}
