package com.example.samiptmgproject

fun main(){
//    kotlin collection

//    kotlin collection is a root of collection of hierarchy, this interface represents the commonb behaviour of a read only collection: retrieving size , checking item membership,
//    and so on.

//    list
//
//list is an ordered collection with access to elements by indices- integer number that reflect their position


//    list stores data in specified order and porovides indexed access to them
//    example
    fun displayList(){
//        val numbers : String = listOf("one" , "two" , "three" , "four")
//
//        println("number of elements : ${numbers.Size}")
//        println("third element${numbers.Get(2)}")
//        println("fourth element${numbers[3]}")

//    there are two types of list
//        mutable and immutable list


    }

//mutable list can be modified where as immutable cannot be modified


//    set: set is a collection of unique elements
//      two sets are equal if they have same size of number of elements, set can be mutable and immutable too
fun set(){
    val numbersss = setOf(1,2,3,4,5)
    for (elements in numbersss){
        println(elements)
    }
    val numbersBackwards = setOf(4,3,2,1)
//    println("THe set are equal: ${numbers == numbersBackwards}")


}

//
//    map: map is the dictionary of kotlin where the values are assigned to they keys
    fun map(){
        val countryCapitals = mapOf(
           "Nepal" to "kathmandu",
           "india" to "new delhi",
           "china " to "beijing",
        )
    println("all keys: ${countryCapitals.keys}")
    println("all v:alues ${countryCapitals.values}")

    }

    // the up;p;er map; ios also a immutable map;

   //mutable map

    fun muitablemap(){
        val studentMarks = mutableMapOf(
            "ram" to 45,
            "shyam" to 99,
            "hari" to 88,
            "radha" to 59,
        )
    }
    //task dictionary

    println(" enter your word here ==> ")

    fun meaning() {
        println("Enter your word here ==> ")

        val word = readLine()

        // Define the dictionary
        val dict = mapOf(
            "apple" to "a small round fruit",
            "orange" to "an orange coloured fruit"
        )

        // Check if the word exists in the dictionary
        if (word != null && word in dict.keys) {
            println(dict[word])
        } else {
            println("Word not in dictionary")
        }
    }



    meaning()



}
