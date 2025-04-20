package com.example.samiptmgproject

fun main(){
//    println("hellow world")

//    mutable variable
//    which can be changed
//    eg:
    var age = 18
    var firstname = "Samip"
    var lastname = "tamang"

//    immutable variable
    val ages = 18

//    println(firstname + " "+lastname)
    println("$firstname $lastname")
    println("${firstname.length}") // the curly bracket is used for accessing the properties of the variable rather than its value
    //$ only works in string value ""  intercottation

//    declaring variable in java
    var name : String = "Samip"  //this method can be used to declare the datatype for our declared variable, if not used ; variable can take dynamic types of data types
    var aeg : Int = 20

//    var address = arrayOf("ktm","pokhara","Bhaktapur")
//    address[2] = "pathari" // cannot intert into array so we need arraylist
//    println(address)

    var address = arrayListOf("ktm","pokhara","Bhaktapur")// arraylist with small a can be used to declare the variable at same time
    address.add("Pathari")
    println(address)

    var data = ArrayList<Any>()
    data.add(1)
    data.add("samip")
    data.add(18)
    println(data)

    var dictionary = mapOf(
        "apple" to "this is fruit",
        "samsung" to "this is brand"
    )
    println("the value of apple is ${dictionary["apple"]}")

//    which case is replaced by when statement

    for (i in 0..5){
        print(i)
    }


    fun calculate(a : Int, b : Int) : String{ //return type unit and void is same
    }

}
