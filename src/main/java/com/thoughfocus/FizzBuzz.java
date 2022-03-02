package com.thoughfocus;

public class FizzBuzz {
    public String fizzBuzz(Integer i){
        String result="Not a fizzbuzz number";
        if(i%3==0 && i%5==0){
            result = "FizzBuzz";
            return result;
        }

        else if(i % 3 ==0) {
            result = "Fizz";
            return result;
        }
        else if(i%5 ==0){
            result ="Buzz";
            return result;
        }

        return result;
    }
}
