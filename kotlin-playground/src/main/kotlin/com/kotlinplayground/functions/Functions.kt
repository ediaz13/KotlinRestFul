package com.kotlinplayground.functions

import java.time.LocalDate


fun printName(name: String) {
    println("Name is : $name")
}

fun addition(x: Int, y: Int): Int {
    return x + y
}

fun addition_approach1(x: Int, y: Int) = x + y

fun printPersonDetails(
    name: String,
    email: String = "",
    dob: LocalDate = LocalDate.now()
) {

    println("Name is $name and the email is $email and the dob is $dob")

}


fun main() {

    /*val unit = printName("Dilip")
    println("unit is $unit")
    val result = addition(1, 2)
    println("Result is $result")

    val result1 = addition_approach1(1, 2)
    println("Result is $result1")*/

    printPersonDetails("Dilip", "abc@gmail.com", LocalDate.parse("2000-01-01"))

    printPersonDetails("Dilip")
    printPersonDetails(name = "Dilip", dob=LocalDate.parse("2000-01-01"))
    printPersonDetails( dob=LocalDate.parse("2000-01-01"), name = "Dilip", email = "abc@gmail.com")

}


