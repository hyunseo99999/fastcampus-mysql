package com.example.fastcampusmysql.domain.member.dto;

import lombok.Builder;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record MemberDto(
    Long id,
    String email,
    LocalDate birthDay,
    String nickname,
    LocalDateTime createdAt
){}
