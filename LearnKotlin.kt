/**
 * Welcome to "Learn Kotlin in 1 Hour" - Team MAST
 * Youtube : www.youtube.com/TeamMAST
 */

fun main() {

    println("Hello World!")

    // Variables

    //Immutable Type - Value cannot be changed in future
    // Mutable Types - Value can be chnaged in future

    val name = "Karan" // Immutable Type
    var age = 27 // can be changed

    println("Name : $name") // String Interpolation
    println("Age  : $age")

    println("Name : $name")

    val number = 10 // Integer
    val numberFloat = 10.2f // Float

    println("Int number : $number")
    println("Float number : $numberFloat")

    // Type Casting
    println("Float to Int : ${numberFloat.toInt()}")

    // ASCII Code.
    val myChar = 'a'
    println("myChar is : $myChar")
    println("myChar to Int : ${myChar.toInt()}")

    /** ASCII Code
     * A - 65
     * B -66 ... Z - 90
     *
     * a - 97
     * b - 98 ...
     */

    val isName = false
    println("isName : $isName")

    // is - keyword
    println("is isName variable a Boolean Type : ${isName is Boolean}")
    println("is myChar variable a Char Type : ${myChar is Char}")

    // Strings
    val str1 = "Hello"
    val str2 = "World!"

    val str3 = str1 + str2
    println("str3 : $str1 $str2")
    println("Length of str3 : ${str3.length}")

    val str4 = "Hello"
    val str5 = "hello"
    println("Is str4 same as str5 : ${str4 == str5}") // Boolean
    println("Is str4 same as str5 : ${str4.compareTo(str5)}") // Integer

    println("1st character in Str4 is : ${str4[0]}") // H
    println("1st character in Str4 is : ${str4.get(0)}") // H

    // Substring
    println(str4.substring(2)) // llo
    println(str4.substring(0, 2)) // He
    // H E L L O
    // 0 1 2 3 4

    println("Does my String contain lio : ${str4.contains("lio")}")

    // Array
    val array = arrayOf(1, 2, "Karan", 3.14) // Contains different data type values
    for (x in array) {
        println(x)
    }

    println("item at 2nd index in Array : ${array[2]}")
    println("Length of my Array : ${array.size}")
    println("Does my Array contain Karan : ${array.contains("Karan")}")
    println("First item in my Array : ${array.first()}")
    println("Last item in my Array : ${array.last()}")
    println("Index of item 3.14 my Array : ${array.indexOf(3.14)}")

    // Type Specific Array
    val typeArray: Array<Int> = arrayOf(1, 2, 3, 4)
    val stringTypeArray: Array<String> = arrayOf("A", "B", "Karan")

    // Kotlin Ranges
    val oneTo10 = 0..10 // 1 2 3 4 .. 10
    for(x in oneTo10) {
        println(x)
    }

    val alpha = "A".."Z"

    val tenToOne = 10.downTo(1)
    for(x in tenToOne) {
        println(x)
    }

    val twoTo20 = 2.rangeTo(20) // 2 3 4 5 ... 20
    println("Range -")
    val range  = oneTo10.step(3) // 3 6 9
    for(x in range) {
        println(x)
    }

    val range2 = 1 until 10 // 1. 2. 3 ... 9
    println("Range2 -")
    for(x in range2) {
        println(x)
    }

    val reverse = range2.reversed()
    println("Print Reverse List of numbers : ")
    for(x in reverse) {
        println(x)
    }

}
