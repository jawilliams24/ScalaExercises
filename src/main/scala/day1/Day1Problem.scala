package day1

object Day1Problem extends App {

  def piersProblem(a: Int, b: Int, c: Int): Int = {
    // function takes in three ints, adds the smallest two together, then multiplies by the largest
    var nums = List(a, b, c)
    nums = nums.sorted
    (a + b) * c
  }

  println(piersProblem(3, 4, 5))


  def bottlesOfBeer(bottles: Int) = {
    for (i <- bottles to 1 by -1) {
      println(s"$i ${if (i==1) "bottle" else "bottles"} of beer on the wall")
      println(s"$i ${if (i==1) "bottle" else "bottles"} of beer")
      println("Take one down, pass it around")
      println(s"${i - 1} ${if (i-1==1) "bottle" else "bottles"}  of beer")

    }
    println("Time to move onto the whiskey")
  }

  bottlesOfBeer(99)
}
