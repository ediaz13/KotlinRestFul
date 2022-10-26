package com.kotlinplayground.basics

fun main() {
    //if-else
    //when

    var name = "Alex"
    //name = "Chloe"

    val result = if(name.length ==4){
        println("Name is Four Characters")
        name.length
    }else{
        println("Name is not Four Characters")
        name.length
    }

    println("result : $result")

    //1 -> GOLD, 2-> SILVER, 3 -> BRONZE

    var position = 1
    position = 2

    /*val medal =  if(position ==1){
        "GOLD"
    } else if(position ==2){
        "SILVER"
    }
    else if(position ==3){
        "BRONZE"
    }else {
        "NO MEDAL"
    }*/
    position = 4
    val medal = when (position) {
       1 -> "GOLD"
       2 -> "SILVER"
       3 -> "BRONZE"
       else -> "NO MEDAL"
   }

    println(medal)
    
}