package com.example.fastcampusmysql.domain.member.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "MemberNicknameHistory")
@NoArgsConstructor
@Getter
public class MemberNicknameHistory {

    @Id @GeneratedValue
    private Long id;

    private Long memberId;

    private String nickname;

    private LocalDateTime createdAt;

    @Builder
    public MemberNicknameHistory(Long id, Long memberId, String nickname, LocalDateTime createdAt) {
        this.id = id;
        this.memberId = memberId;
        this.nickname = nickname;
        this.createdAt = LocalDateTime.now();
    }
}
