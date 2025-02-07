```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y 
  }
}

object Main extends App {
  val myObject = new MyClass(5)
  println(myObject.myMethod(10)) // Output: 15
}
```