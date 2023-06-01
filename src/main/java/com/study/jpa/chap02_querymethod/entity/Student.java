package com.study.jpa.chap02_querymethod.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="tbl_student")
@Setter // 실무적 측면에서 setter는 신충히 만들것
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of={"id"})
@Builder
public class Student {

    @Id
    @Column(name="stu_id")
    @GeneratedValue(generator = "uid")
    @GenericGenerator(strategy = "uuid", name="uid")
    private String id;
    @Column(name="stu_name",nullable=false)
    private String name;

    private String city;
    private String major;

}
