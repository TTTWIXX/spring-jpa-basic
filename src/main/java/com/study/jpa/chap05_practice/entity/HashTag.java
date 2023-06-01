package com.study.jpa.chap05_practice.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_hash_tag")
@Setter
@Getter
@ToString(exclude = {"post"})
@EqualsAndHashCode(of={""})
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HashTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="tag_no")
    private Long id;


    private String tagName; // 해시태그 이름

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="post_no")
    private Post post;


}
