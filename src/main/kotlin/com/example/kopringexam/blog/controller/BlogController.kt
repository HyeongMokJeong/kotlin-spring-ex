package com.example.kopringexam.blog.controller

import com.example.kopringexam.blog.dto.BlogDto
import com.example.kopringexam.blog.entity.WordCount
import com.example.kopringexam.blog.service.BlogService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/blog")
class BlogController(
    val blogService: BlogService
) {
    @GetMapping
    fun search(@RequestBody @Valid blogDto: BlogDto): String? {
        val result = blogService.searchKakao(blogDto)
        return result
    }

    @GetMapping("/rank")
    fun searchWordRank(): List<WordCount> = blogService.searchWordRank()
}