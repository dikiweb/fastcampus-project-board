package com.fastcampus.projectboard.board.entity;

import java.time.LocalDateTime;

/**
 * packageName   : com.fastcampus.projectboard.board.entity
 * fileName     : Article
 * author       : danny
 * date         : 2023-08-11
 * description  :
 * ===========================================================
 * DATE             AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2023-08-11          danny         최초 생성
 */
public class Article {

    private long id;
    private String title; // 제목
    private String content;  // 본문
    private String hashtag;  // 해시


    private LocalDateTime createdAt; // 생성일시
    private String createdBy;  // 성성자
    private LocalDateTime modifiedAt;  //수정일시
    private String modifiedBy;  // 수정자
}
