package com.choi.searchservice.service

import com.choi.searchservice.entity.PostDocument
import com.choi.searchservice.repository.PostSearchRepository
import org.springframework.stereotype.Service

@Service
class SearchService(private val postSearchRepository: PostSearchRepository) {

    fun searchPosts(query: String): List<PostDocument> {
        return postSearchRepository.findByTitleContainingOrContentContaining(query, query)
    }

    fun indexPost(postDocument: PostDocument): PostDocument {
        return postSearchRepository.save(postDocument)
    }

    fun deletePostFromIndex(id: String) {
        postSearchRepository.deleteById(id)
    }
}