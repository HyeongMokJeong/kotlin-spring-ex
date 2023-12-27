package com.example.kopringexam.core.response

data class ErrorResponse(
    val message: String,
    val errorType: String? = "Invalid Argument",
    val errorCode: Int
) {
}