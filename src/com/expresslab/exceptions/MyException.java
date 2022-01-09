package com.expresslab.exceptions;

public class MyException extends Exception{
    private final static String MESSAGE = "Bugs!";
    public MyException(){
        super(MESSAGE);
    }
}
