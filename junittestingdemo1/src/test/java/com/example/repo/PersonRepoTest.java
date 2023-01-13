package com.example.repo;

import com.example.entities.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonRepoTest {

    @Autowired
    private PersonRepo personRepo;

    @Test
    void isPersonExistsById() {

    Person person = new Person(1234,"Umesh","Delhi");
    personRepo.save(person);
    Boolean actualResult=personRepo.isPersonExistsById(1234);
    assertThat(actualResult).isTrue();

    }
    //testing karne ke bad agar wo result delete karna hai to do function use kar sakte hai 1.tear down and 2. after each

//har ek test ke run hone ke bad ye function run hoga
    @AfterEach
    void tearDown() {
        System.out.println("Tearing Down");
        personRepo.deleteAll();;
    }

    //har ek test ke run hone ke pahle run hoga ye function.
    @BeforeEach
    void setUp() {
        System.out.println("Setting up");
    }
}