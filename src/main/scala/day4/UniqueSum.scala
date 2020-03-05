package day4

object UniqueSum extends App {

  def takeInput(): Unit = {
    var nums = new Array[Int](3)
    for (i <- 0 to 2) {
      nums(i) = scala.io.StdIn.readLine("Please enter a number: ").toInt
    }
    addSum(nums)
  }

  def addSum(nums: Array[Int]): Unit = {

  }

  takeInput()
}
