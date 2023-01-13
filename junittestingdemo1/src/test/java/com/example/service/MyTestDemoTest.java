package com.example.service;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "All the test cases of my test demo")
class MyTestDemoTest {


    private static MyTestDemo myTestDemo;
    //Junit 5 Lifecycle
    /*
    1.@BeforeAll
    2.@AfterAll
    3.@BeforeEach
    4.@AfterEach
     */

    //given above annotation ko chhod ka baki sabhi test cases pe nicche diye gaye annotation hon ehi chahiye.

    /*
        1.@Test
        2.@RepeatedTest
        3.ParameterizedTest
        4.@TestFactory
        5.@TestTemplate
     */

    @BeforeEach
    void setUp() {

        System.out.println("Before Each");

    }

    @AfterEach
    void tearDown() {
        System.out.println("After Each");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All");
        myTestDemo = new MyTestDemo();
    }



    @Test
    void sum() {

        System.out.println("non-static sum method");
           int actualresult = myTestDemo.sum(12,10);
           assertEquals(22,actualresult);
    }

    @Test
    @Disabled
    void sum1() {
         System.out.println("non-static sum1 method");
        int actualresult = myTestDemo.sum(12,10);
        assertEquals(22,actualresult);
    }

    @Test
    void sum2() {
        System.out.println("non-static sum2 method");
        int actualresult = myTestDemo.sum(12,10);
        assertEquals(22,actualresult);
    }

    @Test
    void sum3() {

        System.out.println("non-static sum3 method");
        int actualresult = myTestDemo.sum(12,10);
        assertEquals(22,actualresult);
    }
    @Test
    void sum4() {

        System.out.println("non-static sum4 method");
        int actualresult = myTestDemo.sum(12,10);
        assertEquals(22,actualresult);
    }

    @RepeatedTest(value = 2)
    void RepetedTest() {
       
        System.out.println("non-static sum4 method");
        
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After All");
    }
}