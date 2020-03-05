package day4

object Main extends App {

  def creditCardDoubler(num: Long, check: Boolean): Unit = {
    var numberOfDigits = num.toString.length
    var doubler = false
    var nums = num.toString.toCharArray.map(x => x.getNumericValue.toLong)
    var total = 0L
    for (i <- 1 to numberOfDigits) {
      var finalNumber = nums.last
      if (doubler) {
        if (finalNumber * 2 >= 10) total += numberSplitter(finalNumber * 2)
        else total += finalNumber * 2
        doubler = false
        nums = nums.dropRight(1)
      } else {
        total += finalNumber
        doubler = true
        nums = nums.dropRight(1)
      }
    }
    println(total % 10 == 0)
  }

  def numberSplitter(num: Long) = {
    var units = num % 10
    val tens = 1
    units + tens
  }

  creditCardDoubler(num = 49927398716L, check = true)

}