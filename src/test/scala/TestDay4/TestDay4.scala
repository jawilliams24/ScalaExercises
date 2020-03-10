package TestDay4

import day4.{Blackjack, Main}
import org.scalatest.FlatSpec

class TestDay4 extends FlatSpec {

  "Blackjack.bustCheck" should "return a String" in {
    assert(Blackjack.bustCheck(22,22).isInstanceOf[String])
    assert(Blackjack.bustCheck(22,20).isInstanceOf[String])
    assert(Blackjack.bustCheck(20,22).isInstanceOf[String])
    assert(Blackjack.bustCheck(21,20).isInstanceOf[String])

  }

"Blackjack.cardCompare" should "return a String" in {
  assert(Blackjack.cardCompare(5,17).isInstanceOf[String])
}
  it should "print Dealer wins!" in {
    assert(Blackjack.cardCompare(5,17) == "Dealer wins!")
  }

  "Main.creditCardDoubler" should "return true" in {
    assert(Main.creditCardDoubler(49927398716L, check = true))
  }

  "Main.numberSplitter" should "return 7L" in {
    assert(Main.numberSplitter(16) == 7L)
  }

}
