
package com.example.fundamentalskotlin

fun main() {
    var obj = ClassObject();
    println("The Number Of classobject class : " + obj.num)

    println("Addition : " + obj.add(890,10))
    println("Addition 2 : " + ClassObject().add(900,100))
}

class ClassObject {
    var num=10;

    fun add(a:Int, b:Int) : Int {
        return a+b;
    }

}
