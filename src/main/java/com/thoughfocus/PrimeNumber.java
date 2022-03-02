package com.thoughfocus;

public class PrimeNumber {
    public Boolean primenumber (Integer n){
        boolean primenumber = true;
        for(int i = n-1; i>1;i--){
            if(n%i==0){
                primenumber = false;
                break;
            }
        }
        return primenumber;
    }

}
