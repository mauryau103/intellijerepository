package com.example.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTestDemoTest {

     static EmployeeTestDemo employeeTestDemo;

    @Test
    void add() {
    }

    @BeforeAll
    static void beforeAll() {
employeeTestDemo = new EmployeeTestDemo();
    }

    @Test
    void assertTrueTest(){
        assertTrue(10>6,"10 is greater than 6");
    }

    @Test
    void assertFalseTest(){
       // assertFalse(10<6,()->"this is false");
        BooleanSupplier condition = ()->78<10;
        assertFalse(condition,"78 is less than 10");

    }

    @Test
    void assertEqualsTest(){

//        int actual = employeeTestDemo.add(2,3);
//        assertEquals(5,actual);
        float square =4*4;
        float rectangle = 5*8;
        float delta = 100;
        String s1 = "Umesh";
        String s2 = "Umesh";
        assertEquals(square,rectangle,delta);
       // assertEquals(s1,s2);
    }

}