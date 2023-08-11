package com.fastcampus.projectboard.board.repository;

import com.fastcampus.projectboard.board.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName   : com.fastcampus.projectboard.board.repository
 * fileName     : ArticleRepository
 * author       : danny
 * date         : 2023-08-11
 * description  :
 * ===========================================================
 * DATE             AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2023-08-11          danny         최초 생성
 */
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
