package com.nimdanoob.src

data class Person(val name: String,
                  val age:Int? =null)

fun main(args: Array<String>){
    var persons = listOf<Person>(Person("ALice"),
            Person("Bob", age = 29))
    val oldest = persons.maxBy { it.age ?:0 }
    println("The oldest is: $oldest")
}