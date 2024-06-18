package com.example.fundamentalskotlin

class MyClass {
    companion object{
        @JvmStatic

        fun main(args: Array<String>){

            var a:String ="Shruti"
            println("Hello " + a + " Welcome to Kotlin")
            a="rani"
            println("Hello  $a Welcome to Kotlin")

            val b:Int = 100
            println(b);

        }
    }
}
