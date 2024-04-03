package com.javaex.ex05;

public class Div {

    private int a;
    private int b;
    
    public void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    }

    public int calculate() {
        try {
    	return a / b;
        } catch (ArithmeticException e) {
        	System.err.println("0으로 나눌 수 없습니다");
        	return -1;
        }
    }

}
