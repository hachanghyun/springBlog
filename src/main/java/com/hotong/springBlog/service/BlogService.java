package com.hotong.springBlog.service;

import com.hotong.springBlog.domain.Article;
import com.hotong.springBlog.dto.AddArticleRequest;
import com.hotong.springBlog.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor //final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service //빈으로 등록
public class BlogService {

    private final BlogRepository blogRepository;

    //블로그 글 추가 메서드
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }
}