package com.kw.Ddareungi.domain.user.entity;

import com.kw.Ddareungi.domain.model.entity.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

//    //loginId -> username으로 변경(소셜로그인)
//    @Column(name = "username", unique = true, updatable = false, nullable = false)
//    private String username;

    //성명
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    //비밀번호 : 소문자, 대문자, 특수문자 포함 8글자 이상
    private String password;
}
