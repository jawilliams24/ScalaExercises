package Initial

object Main extends App {

  println("James is trash")

  val ting = "Eclipse is James

  class Person(var name: String, var age: Int)

  val person = new Person("Sam", 24 )
  println(person.name)
  println(person.age)
  def sayHello = {
    "ello m8"
  }

  def isEven(num: Int): Boolean = {
    if (num % 2 == 0)
      true
    else
      false
  }

  isEven(7)
  isEven(12)

  val num = 12
  println(num+8)
  println(num.+(8))

  for(i <- 1 to 10 by 3) println(i)
  for(i<-1 to 5; j<-1 to 10) println(i+" "+j)
  val intList = List(1,2,3,4)
  for(item<-intList) println(item)

  for(i<-1 to 10
      if i>2
      if i<8) println(i)

  for(i<- 1 to 3) yield i

  var count = 0;
  do {
    println("Counting to 10")
    count+1
  } while (count>11)
}
