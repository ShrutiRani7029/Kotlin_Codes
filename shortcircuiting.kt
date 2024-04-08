Short-circuiting in Kotlin refers to the behavior of stopping the evaluation of an expression once its outcome is determined. Example: val result = (x > 0) && (y < 10).

1.val result = (x > 0) && (y < 10)
if x is not greater than 0, the second condition (y < 10) won't be evaluated due to short-circuiting.

2.val result = (x > 0) || (y < 10)
In this case, if x is greater than 0, the second condition (y < 10) won't be evaluated due to short-circuiting because the OR operator || only needs one condition to be true for the entire expression to be true.


//another example
//Short-circuiting
fun main() {
   var i=10;
    var j=11;
    var result= i == 10 || j++ ==12;
    println(i);
    println(j);
    
}
//output: 10 11

//Short-circuiting
fun main() {
   var i=10;
    var j=11;
    var result= i == 11 || j++==11;
    println(i);
    println(j);
    
}
//output: 10 12
