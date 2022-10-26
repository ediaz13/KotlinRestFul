package com.kotlinplayground.basics

fun main() {
    val name : String = "Ema"
    println(name)

    var age : Int = 33
    println(age)
    age = 34
    println(age)

    //Type Inference
    var salary = 43000L
    println(salary)

    //Strin interpolation
    var course = "Kotlin Spring"
    println("course: $course and course length is ${course.length}")

    var multiline = "AND \n DEF"
    println(multiline)

    var multiline1 = """"
    ABD
    DEF
    """.trimIndent()
    println(multiline1)


}