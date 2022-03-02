package com.thoughfocus;

public class GreatestCommonDivisor {
    public Integer abc (Integer a ,Integer b){
        if(b==0) {
            return a;
        }
        return abc(a,b%a);
    }

}
