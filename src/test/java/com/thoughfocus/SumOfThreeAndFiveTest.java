package com.thoughfocus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfThreeAndFiveTest {
    SumOfThreeAndFive stf = new SumOfThreeAndFive();
    @Test
    void stf1(){
        assertEquals(0,stf.sum(2));
    }

    @Test
    void stf2(){
        assertEquals(14,stf.sum(8));
    }

    @Test
    void stf3(){
        assertEquals(23,stf.sum(9));
    }

    @Test
    void stf4(){
        assertEquals(0,stf.sum(1));
    }

}