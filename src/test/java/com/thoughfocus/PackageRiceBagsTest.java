package com.thoughfocus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageRiceBagsTest {
    PackageRiceBags prb = new PackageRiceBags();
    @Test
    void pbr1(){
        assertEquals(false,prb.packageRice(5,3,24));
    }

    @Test
    void pbr2(){
        assertEquals(true,prb.packageRice(7,8,32));
    }





}