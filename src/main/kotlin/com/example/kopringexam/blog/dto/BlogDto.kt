package com.example.kopringexam.blog.dto

import com.example.kopringexam.core.annotation.ValidEnum
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

// data 클래스
// 생성자, getter, setter, copy, toString 등
data class BlogDto(
    @field:NotBlank(message = "query parameter required")
    @JsonProperty("query")
    private val _query: String?,

    @field:NotBlank(message = "sort parameter required")
    @ValidEnum(enumClass = EnumSort::class)
    val sort: String?,

    @NotNull(message = "page parameter required")
    @Max(50, message = "page is more then max")
    @Min(1, message = "page is more then min")
    val page: Int?,

    @NotNull(message = "size parameter required")
    val size: Int?,
) {
    val query: String
        get() = _query!!

    private enum class EnumSort {
        accuracy,
        recency
    }
}