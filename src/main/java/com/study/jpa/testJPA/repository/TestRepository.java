package com.study.jpa.testJPA.repository;

import com.study.jpa.testJPA.entity.TestJPA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository
        extends JpaRepository<TestJPA,String> {

}
