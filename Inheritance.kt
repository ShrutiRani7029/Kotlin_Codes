

fun main(){
  val obj = class_child()

  println("Name : "+obj.name) //we can access our parent_class through child_class
  println("Sum : "+obj.Add(5,6))
  
}

open class class_parent { //parent class //jis bhi class ko hm inherit krne wale hai uske aage open keyword

  open var name = "Shruti" // hm ise override krna chahte to open lgaenge

  open fun Add(a:Int, b:Int) : Int{
    return a+b
  }
}

class class_child : class_parent(){ //child class // java ke andr extends use hota in kotlin colon(:)
 override var name: String = "Rani"

  override fun Add(a:Int, b:Int) : Int{
    val sum = super.Add(a,b)
    val sqr = sum*sum
    retrun sqr
  }
   
}


//Answer : Name: shruti, Sum: 11
//after overriding ans: rani, 121
  
  

  
