package com.study.jpa.chap05_practice.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_post")
@Setter
@Getter
@ToString(exclude = {"hashTags"})
@EqualsAndHashCode(of={"id"})
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="post_no")
    private Long id;

    @Column(nullable = false)
    private String writer; // 작성자

    private String content; // 내용

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createDate; // 작성시간

    @CreationTimestamp
    private LocalDateTime updateDate; // 수정시간

    @OneToMany(mappedBy = "post")
    // 초기화 의무!!!!!!!!!!!!!
    private List<HashTag> hashTags=new ArrayList<>();

}
