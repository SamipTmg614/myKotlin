package com.example.samiptmgproject

fun main(){

//arrays
    var age = arrayOf(1,2,3)
    println(age)


//    arraylist
    var age1 = ArrayList<Int>()
    age1.add(1)
    age1.add(1,20)
    age1.add(5)

//    we can addd value directly in array hwile initializing variables
    var name = arrayListOf<String>("Samip","Ram","Shyam")
    name.add("manish")
    name.removeAt(0)
    name.remove("Ram")


    var mixArrayList = arrayListOf<Any>("hello",2,4.5)
    println(mixArrayList[0])
    println(mixArrayList[2])
    println(mixArrayList[1])
}