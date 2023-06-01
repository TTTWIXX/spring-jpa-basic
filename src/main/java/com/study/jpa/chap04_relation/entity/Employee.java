package com.study.jpa.chap04_relation.entity;

import lombok.*;

import javax.persistence.*;

@Setter @Getter
@ToString(exclude = "department")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_emp")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id")
    private Long id;

    @Column(name="emp_name",nullable=false)
    private String name;

    // 단방향 연관관계
    @ManyToOne(fetch = FetchType.LAZY)
    // 내가 다 구조이기 때문에 ManyToOne
    // FetchType.Lazy : 필요할때만 join 을 한다.
    // FetchType.EAGER: 항상 무조건 조인을 수행
    @JoinColumn(name="dept_id")
    private Department department;

}
