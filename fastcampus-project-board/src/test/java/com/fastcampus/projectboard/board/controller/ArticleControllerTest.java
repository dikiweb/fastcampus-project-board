package com.fastcampus.projectboard.board.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * packageName   : com.fastcampus.projectboard.board.controller
 * fileName     : ArticleControllerTest
 * author       : danny
 * date         : 2023-08-17
 * description  :
 * ===========================================================
 * DATE             AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2023-08-17          danny         최초 생성
 */
@DisplayName("View-컨트롤러: 게시판")
@WebMvcTest(ArticleController.class)
class ArticleControllerTest {

    private final MockMvc mvc;

    public ArticleControllerTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }

    @Test
    @DisplayName("[view][GET] 게시글 목록")
    public void given_whenRequestArticleView_then() throws Exception {
        // given

        // when
        mvc.perform(get("/articles"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.TEXT_HTML))
                .andExpect(model().attributeExists("articles"));

        // then
    }

    @Test
    @DisplayName("[view][GET] 게시글 상세")
    public void given_whenRequestArticleView_thenReturnArticle() throws Exception {
        // given

        // when
        mvc.perform(get("/articles/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.TEXT_HTML))
                .andExpect(model().attributeExists("articles"));

        // then
    }

    @Test
    @DisplayName("[view][GET] 게시글 검색 전용")
    public void given_whenRequestArticleSearcghView_thenReturnArticle() throws Exception {
        // given

        // when
        mvc.perform(get("/articles/search"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.TEXT_HTML));

        // then
    }

    @Test
    @DisplayName("[view][GET] 해시테그 검색")
    public void given_whenRequestArticleSearchHash_thenReturnArticle() throws Exception {
        // given

        // when
        mvc.perform(get("/articles/search-hashtag"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.TEXT_HTML));

        // then
    }
}
