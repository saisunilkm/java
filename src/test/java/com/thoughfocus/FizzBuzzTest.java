package com.thoughfocus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
FizzBuzz fb = new FizzBuzz();
    @Test
    void fizzBuzz() {
        assertEquals("Fizz",fb.fizzBuzz(12));
    }

    @Test
    void fizzBuzz1(){
        assertEquals("Buzz",fb.fizzBuzz(20));
    }

    @Test
    void fizzBuzz2(){
        assertEquals("fizzBuzz",fb.fizzBuzz(15));
    }


}