package com.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//if you want to spin up your whole spring container then use annotation @SpringBootTest or else it is optional to use. always.



@SpringBootTest
class Junittestingdemo1ApplicationTests {

    private Calculator c = new Calculator();


    //for disabling any test  cases or any method use @disabled annotation.but there is one condition after applying disabled if you want to see the output you have to run it all.at once means whole class.
    @Test
    @Disabled
    void contextLoads() {
    }

    //test annotation is used to mark the method for checking as a test or run it as a test method.

    @Test
    void testSum(){

        //expected result
        int expectedResult = 17;

        //actual
        int actualResult = c.duSum(12,3,2);
//now we use assertion(AssertJ) to qualify our test conditions.
        assertThat(actualResult).isEqualTo(expectedResult);

    }

    @Test
   void testProduct(){
        //expected
       int expectedResult = 6;

       int actualResult = c.diMult(2,3);

       assertThat(actualResult).isEqualTo(expectedResult);

   }

   //compare two number boolean return

    @Test
    void testCompareNums(){
        //actual result
        Boolean actualResult = c.compareTwoNumber(3,3);

        //new assert method to give expected value for boolean value function.

        assertThat(actualResult).isTrue();

    }

}
