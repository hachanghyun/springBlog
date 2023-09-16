package com.hotong.springBlog.repository;

import com.hotong.springBlog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
