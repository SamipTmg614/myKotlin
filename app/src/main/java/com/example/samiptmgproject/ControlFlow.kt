package com.example.samiptmgproject

fun main(){
    //control flow statements
//    decision making statements and looping statements

//    decision making statements
//          if else statement
    println("input a number")
    val input = readLine()
    val number = input?.toIntOrNull()

    if (number == null) {
        println("That's not a valid number.")
    } else if (number > 0) {
        println("The number is positive.")
    } else if (number < 0) {
        println("The number is negative.")
    } else {
        println("The number is zero.")
    }

    val score = input?.toIntOrNull()


    if (score == null || score < 0 || score > 100) {
        println("Invalid score. Please enter a number between 0 and 100.")
    } else if (score >= 90) {
        println("Grade: A")
    } else if (score >= 80) {
        println("Grade: B")
    } else if (score >= 70) {
        println("Grade: C")
    } else if (score >= 60) {
        println("Grade: D")
    } else {
        println("Grade: F")
    }

//    nested

    println("Enter your age:")


    val age = input?.toIntOrNull()

    if (age == null || age < 0) {
        println("Invalid age.")
    } else {
        if (age >= 18) {
            println("You are eligible to vote.")

            if (age == 18) {
                println("Looks like you're a first-time voter!")
            }
        } else {
            println("You are not eligible to vote yet.")
        }
    }


    // WHEN STAEMENT

//    IT IS SIMILAR TO A SWITCH CASE IN OTHER LANGUAGE
    val dayNumber = 3

    when (dayNumber) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day number")
    }

//    for loop
    for (i in 1..5) {
        println("Number: $i")
    }
//    while loop
    var i = 1

    while (i <= 5) {
        println("Number: $i")
        i++  // Don't forget to increment, or it could loop forever!
    }

//    Do while loop
    var j = 1

    do {
        println("Number: $i")
        i++
    } while (i <= 5)

}