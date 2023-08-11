package com.fastcampus.projectboard.board.repository;

import com.fastcampus.projectboard.board.entity.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName   : com.fastcampus.projectboard.board.repository
 * fileName     : ArticleCommentRepository
 * author       : danny
 * date         : 2023-08-11
 * description  :
 * ===========================================================
 * DATE             AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2023-08-11          danny         최초 생성
 */
public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
