package com.example.newsapp.domain.use_cases.news

import com.example.newsapp.domain.model.Article
import com.example.newsapp.domain.repository.NewsRepository

class DeleteArticle(
    private val newsRepository: NewsRepository
) {

    suspend operator fun invoke(article: Article) {
        newsRepository.deleteArticle(article)
    }
}