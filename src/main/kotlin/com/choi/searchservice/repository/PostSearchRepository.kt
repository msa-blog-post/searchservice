package com.choi.searchservice.repository

import com.choi.searchservice.entity.PostDocument
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository
import org.springframework.stereotype.Repository

@Repository
interface PostSearchRepository : ElasticsearchRepository<PostDocument, String> {
    fun findByTitleContainingOrContentContaining(title: String, content: String): List<PostDocument>
}