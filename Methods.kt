package com.example.fundamentalskotlin

class MyClass {
    companion object{
        @JvmStatic

        fun main(args: Array<String>){


            fun add(a:Int, b:Int) : Int {
                return a+b;
            }
            fun add(a:Int,b:Int, c:Int):Int {
                return a+b+c;
            }

            println(add(2,3,6));

        }
    }
}
