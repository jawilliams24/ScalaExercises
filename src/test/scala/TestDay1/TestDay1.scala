package TestDay1

import day1.{Day1Problem, Main}
import org.scalatest.FlatSpec

class TestDay1 extends FlatSpec {

  "Day1Problem.piersProblem" should "return an Int" in {
    assert(Day1Problem.piersProblem(1,2,3).isInstanceOf[Int])
  }

"Day1Problem.bottlesOfBeer" should "return a String" in {
  assert(Day1Problem.bottlesOfBeer(99).isInstanceOf[String])
}

  "Main.endString" should "return a String" in {
    assert(Main.endString("hello", 3).isInstanceOf[String])
  }

  it should "return llo" in {
    assert(Main.endString("hello", 3) == "llo")
  }
}
