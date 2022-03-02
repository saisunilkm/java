package com.thoughfocus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    PrimeNumber pn = new PrimeNumber();
    @Test
    void pn1(){
        assertEquals(true,pn.primenumber(0));
    }

    @Test
    void pn2(){
        assertEquals(true,pn.primenumber(11));
    }

    @Test
    void pn3(){
        assertEquals(false,pn.primenumber(10));
    }



}