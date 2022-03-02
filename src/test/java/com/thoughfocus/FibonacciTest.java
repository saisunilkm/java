package com.thoughfocus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    Fibonacci fb = new Fibonacci();

    @Test
    void fibonacci(){
        assertEquals(0,fb.fibonacci(0));
    }

    @Test
    void fibonacci1(){
        assertEquals(1,fb.fibonacci(1));
    }

    @Test
    void fibonacci2(){
        assertEquals(1,fb.fibonacci(2));
    }





}