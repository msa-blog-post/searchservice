package com.choi.searchservice.controller

import com.choi.searchservice.entity.PostDocument
import com.choi.searchservice.service.SearchService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/search")
class SearchController(private val searchService: SearchService) {

    @GetMapping
    fun searchPosts(@RequestParam query: String): List<PostDocument> {
        return searchService.searchPosts(query)
    }

    @PostMapping("/index")
    fun indexPost(@RequestBody postDocument: PostDocument): PostDocument {
        return searchService.indexPost(postDocument)
    }

    @DeleteMapping("/{id}")
    fun deletePostFromIndex(@PathVariable id: String) {
        searchService.deletePostFromIndex(id)
    }
}