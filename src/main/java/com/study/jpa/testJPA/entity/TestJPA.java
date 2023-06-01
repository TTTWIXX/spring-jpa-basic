package com.study.jpa.testJPA.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Table(name="test_table")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class TestJPA {

    @Id
    @GeneratedValue(generator = "uid")
    @GenericGenerator(strategy = "uuid",name="uid")
    private String id;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @UpdateTimestamp
    private LocalDateTime localDateTime;


    public enum Gender {
        M,F
    }
}
