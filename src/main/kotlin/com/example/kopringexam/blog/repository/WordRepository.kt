package com.example.kopringexam.blog.repository

import com.example.kopringexam.blog.entity.WordCount
import org.springframework.data.repository.CrudRepository

interface WordRepository : CrudRepository<WordCount, String> {
    fun findTop10ByOrderByCntDesc(): List<WordCount>
}