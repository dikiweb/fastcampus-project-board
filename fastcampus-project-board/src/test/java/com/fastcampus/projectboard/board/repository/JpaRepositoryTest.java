package com.fastcampus.projectboard.board.repository;

import com.fastcampus.projectboard.board.entity.Article;
import com.fastcampus.projectboard.common.config.JpaConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

/**
 * packageName   : com.fastcampus.projectboard.board.repository
 * fileName     : JpaRepositoryTest
 * author       : danny
 * date         : 2023-08-11
 * description  :
 * ===========================================================
 * DATE             AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2023-08-11          danny         최초 생성
 */
@DisplayName("JPA 연결 테스트")
@Import(JpaConfig.class)
@DataJpaTest
class JpaRepositoryTest {

    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    public JpaRepositoryTest(
            @Autowired ArticleRepository articleRepository,
            @Autowired ArticleCommentRepository articleCommentRepository) {
        this.articleRepository = articleRepository;
        this.articleCommentRepository = articleCommentRepository;
    }

    @Test
    @DisplayName("Select Test")
    public void givenTestData_whenSelecting_thenWorksFine() {
        // given

        // when
        List<Article> articleList = articleRepository.findAll();

        // then
        assertThat(articleList).isNotNull().hasSize(0);
    }


    @Test
    @DisplayName("insert test")
    public void givenTestData_whenInserting_thenWorksFine() {
        // given
        long count = articleRepository.count();

        Article article = Article.of("new article", "new content", "#spring");

        // when
        Article savedArticle = articleRepository.save(article);

        // then
        assertThat(articleRepository.count()).isEqualTo(count + 1);
    }

/*    @Test
    @DisplayName("update test")
    public void givenTestData_whenUpdating_thenWorksFine() {
        // given
        Article articleOne = Article.of("new article", "new content", "#spring");
        articleRepository.save(articleOne);


        Article article1 = articleRepository.findById(1L).orElseThrow();
        String updateHashtag = "#springboot";
        article1.setHashtag(updateHashtag);

        // when
        Article savedArticle = articleRepository.saveAndFlush(article1);
        articleRepository.flush();

        // then
        assertThat(savedArticle).hasFieldOrPropertyWithValue("hashtag", updateHashtag);
    }*/


/*    @Test
    @DisplayName("delete test")
    public void givenTestData_whenDeleting_thenWorksFine() {
        // given
        Article articleOne = Article.of("new article", "new content", "#spring");
        articleRepository.save(articleOne);


        Article article1 = articleRepository.findById(1L).orElseThrow();

        long preArticleCount = articleRepository.count();
        long preArticleCommentCount = articleCommentRepository.count();
        int deleteCommentsSize = article1.getArticleComment().size();


        // when
        articleRepository.delete(article1);

        // then
        assertThat(articleRepository.count()).isEqualTo(preArticleCount - 1);
        assertThat(articleCommentRepository.count()).isEqualTo(preArticleCommentCount - deleteCommentsSize);
    }*/
}