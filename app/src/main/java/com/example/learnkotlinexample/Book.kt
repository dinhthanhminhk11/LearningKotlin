package com.example.learnkotlinexample


// hàm tạo  constructor
class Book(var brand: String, var model: String, var year: Int) {
    fun read() {
        println("Reading now $brand")
    }

    fun countPages(count: Int) {
        println("Book is pages $count")
    }
}