package day4

object Blackjack extends App {

  def dealBlackjack(): Unit = {
    bustCheck(
      scala.io.StdIn.readLine("Please enter your card total: ").toInt,
      scala.io.StdIn.readLine("Please enter dealer card total: ").toInt
    )
  }

  def bustCheck(player: Int, dealer: Int): String = {
    if (player > 21 && dealer > 21) "Both of you went bust, nobody wins!"
    else if (dealer > 21) "You win, the dealer went bust!"
    else if (player > 21) "You lose, you went bust!"
    else cardCompare(player, dealer)
  }

  def cardCompare(player: Int, dealer: Int): String = {
    if (player > dealer) "You win!"
    else "Dealer wins!"
  }

  dealBlackjack()
}
