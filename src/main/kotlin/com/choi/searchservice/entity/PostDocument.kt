package com.choi.searchservice.entity

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document

@Document(indexName = "posts")
data class PostDocument(
    @Id
    val id: String,
    val title: String,
    val content: String
)