package com.study.jpa.testJPA.repository;

import com.study.jpa.testJPA.entity.TestJPA;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@Transactional
//@Rollback(value = false)
class TestRepositoryTest {


    @Autowired
    TestRepository testRepository;

    @BeforeEach
    void insertData(){
        TestJPA build1 = TestJPA.builder()
                .gender(TestJPA.Gender.M)
                .build();

        TestJPA build2 = TestJPA.builder()
                .gender(TestJPA.Gender.F)
                .build();

    }
    
    @Test
    @DisplayName("전체 리스트를 보여주는 기능")
    void findAll() {
        //given
        List<TestJPA> all =
                testRepository.findAll();

        //when

        //then
        System.out.println("\n\n\n");
        System.out.println("여기입니다.");
        all.forEach(System.out::println);
        System.out.println("\n\n\n");
    }
    
    

}