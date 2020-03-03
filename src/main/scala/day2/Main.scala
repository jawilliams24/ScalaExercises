package day2

object Main extends App {

  def stringChar(str1: String, str2: String, char1: Char, char2: Char) = {
    var word = str1 + str2
    word = word.replace(char1, char2)
    word
  }
//  println(stringChar("Ha", "llo", 'a', 'e'))

  def adder(a: Int, b: Int, check: Boolean) = {
    if (a == 0) {
      b
    } else if (b == 0) {
      a
    }
    else if (check) {
      a + b
    } else {
      a * b
    }
  }
//  println(adder(9, 14, check = false))

  def iterator(word: String, num: Int): Unit = {
    for (i <- 1 to num) {
      println(word)
    }
  }
//  iterator("trash", 2)

  def iteratorSquare(word: String, num: Int): Unit = {
    for (i <- 1 to num) {
      println(word * num)
    }
  }
//  iteratorSquare("Hello", 5)

  def fizzBuzz(fizz: String, buzz: String, num: Int): Unit = {
    for (i <- 1 to num) {
      var str = new StringBuilder

      if (i % 3 == 0) {
        str.append(fizz)
      }
      if (i % 5 == 0) {
        str.append(buzz)
      }
      if (str.isEmpty) str = new StringBuilder(i.toString())

      println(str)
    }
  }
//  fizzBuzz("Fizz", "Buzz", 15)

  @scala.annotation.tailrec
  def iterationRecursion(word: String, num: Int): Int = {
    if (num == 0) 0
    else {
      println(word)
      iterationRecursion(word, num - 1)
    }
  }
//  iterationRecursion("trash", 5)

  @scala.annotation.tailrec
  def iterationRecursion2(word: String, num: Int, init: Int): Int = {
    if (num != 0) {
      println(word * init)
      iterationRecursion2(word, num - 1, 5)
    } else 0
  }
//  iterationRecursion2("Hello", 5, 5)

  @scala.annotation.tailrec
  def iterationRecursion3(fizz: String, buzz: String, target: Int, num: Int): Int = {
    if (num <= target) {

      var str = new StringBuilder
      if (num % 3 == 0) {
        str.append(fizz)
      }
      if (num % 5 == 0) {
        str.append(buzz)
      }
      if (str.isEmpty) {
        str = new StringBuilder(num.toString())
      }
      println(str)
      iterationRecursion3(fizz, buzz, target, num + 1)
    } else 0
  }
//  iterationRecursion3("Fizz", "Buzz", 15, 1)

  def patternAdder(a: Int, b: Int, check: Boolean) = (a, b, check) match {
    case (_, 0, _) => a
    case (0, _, _) => b
    case (_, _, true) => a + b
    case (_, _, false) => a * b
    case _ => -1
  }
//  println(patternAdder(14, 9, check = true))

  def patternMatching2(a: Int, b:Int): Unit = (a, b) match {
    case(_,_) => println(s"$b $a")
  }

  patternMatching2(9, 14)


}
