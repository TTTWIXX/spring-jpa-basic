package com.study.jpa.testJPA.entity;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Rollback(value = false)
@Transactional
class TestJPATest {




}