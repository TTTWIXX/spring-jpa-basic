package com.study.jpa.chap01_basic.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_product")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Product {

    // PK
    @Id
    //AUTO_INCREMENT
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id")
    private long id;

    @Column(name = "prod_name", nullable = false, length = 30)
    private String name;

    // default = 0
    @Builder.Default
    private int price=0;

    @Enumerated(EnumType.STRING)
    private Category category;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime updatedDate;

    public enum Category{
        FOOD, FASHION, ELECTRONIC
    }
}