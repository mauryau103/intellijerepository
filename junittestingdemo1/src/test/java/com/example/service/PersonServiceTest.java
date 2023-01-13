package com.example.service;

import com.example.entities.Person;
import com.example.repo.PersonRepo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PersonServiceTest {


    /*
    Now yaha pe humlog getAllPerson() ki testing kar rahe hai jo inside me repo ke methods use kar raha hai.
    Aur pahle hi hum log repo ka unit testing kar chuke hai .
    As we are going with unit testing here Mockito help to test the environment where fake data requirement is there.

     */

/*
what is testing logic here?
hum log yaha pe personService ka get all method call karenge jo hame sare Person de dega.
here we will check tha (data from personService.getAllPerson() is equal to personRepo.getAll())
if the data verifies then  the test is success.
here we autowire personservice only not the repo.because we dont want the result of repository.
But if we autoWired the PersonRepo than we get actual data mean real one .....then there is no use of Mockito or fake data.
 */


    //after appying @Mock then it says we have to just use the duplicate data of person repo.

    @Mock
    private PersonRepo personRepo;
    @InjectMocks
    private PersonService personService;

 //   AutoCloseable autoCloseable;

//    @Autowired
//    private PersonService personService;

    //now yaha pe real wale service class me ek constructor create kiya jisme hum yaha se apna fake wala repo pass kar rahe hai .,...
    //agar ye nahi karte to by default jab yaha se test ke liye getAllPerson call karenge to waha pe real wala repo call ho jata hai interna;lly.
    //so that's why we have created a constructor in real service class.

    @BeforeEach
    void setUp() {
        //using that constructor to set the fake repo for testing.

//        AutoCloseable autoCloseable = MockitoAnnotations.openMocks(this); --> by using this there is no need to upper annotation that extends wala.

        this.personService=new PersonService(this.personRepo);
    }

//    @AfterEach
//    void tearDown() {
//        this.autoCloseable.close();
//    }

    @Test
    void getAllPerson() {

        personService.getAllPerson();
        Mockito.verify(personRepo).findAll();
     //   List<Person> person = (List<Person>) Person.builder().build();
       // Mockito.when(personService.getAllPerson()).thenReturn(( person);
      //  Mockito.verify(personService).getAllPerson();

    }
}