package com.fastcampus.projectboard.board.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * packageName   : com.fastcampus.projectboard.board.controller
 * fileName     : DataRestTest
 * author       : danny
 * date         : 2023-08-12
 * description  :
 * ===========================================================
 * DATE             AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2023-08-12          danny         최초 생성
 */
@DisplayName("Data REST Test")
@Transactional
@AutoConfigureMockMvc
@SpringBootTest
public class DataRestTest {

    private final MockMvc mvc;

    public DataRestTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }

    @Test
    @DisplayName("[API] 게시글 목록 조회")
    public void given_whenMvcTest_then() throws Exception {
        // given

        // when
        mvc.perform(get("/articles"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));

        // then
    }

    @Test
    @DisplayName("[API] 게시글 단건 조회")
    public void given_whenArticleOne_then() throws Exception {
        // given

        // when
        mvc.perform(get("/articles/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));

        // then
    }

    @Test
    @DisplayName("[API] 게시글 -> 댓글 목록 조회")
    public void given_whenArticleOneArticleCommentList_then() throws Exception {
        // given

        // when
        mvc.perform(get("/articles/1/articleComment"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));

        // then
    }

    @Test
    @DisplayName("[API] 댓글 목록 조회")
    public void given_whenArticleCommentList_then() throws Exception {
        // given

        // when
        mvc.perform(get("/articleComments"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));

        // then
    }

    @Test
    @DisplayName("[API] 댓글 단건 조회")
    public void given_whenArticleCommentOne_then() throws Exception {
        // given

        // when
        mvc.perform(get("/articleComments/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));

        // then
    }


}
