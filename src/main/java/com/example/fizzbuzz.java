package com.example;

public class fizzbuzz {
    public static void main(String[] args) {
        System.out.println("hello");
    }

    public String output(int num)
    {
        if(num%3==0 && num%5==0)
            return "Fizzbuzz";
        if(num%3==0)
            return "Fizz";
        if(num%5==0)
            return "buzz";
        else
            return "Error";
    }
}
