package day4

object Blackjack extends App {

  def dealBlackjack() = {
    var player = scala.io.StdIn.readLine("Please enter your card total: ").toInt
    var dealer = scala.io.StdIn.readLine("Please enter dealer card total: ").toInt
    bustCheck(player, dealer)
  }

  def bustCheck(player: Int, dealer: Int) = {
    if(player > 21 && dealer > 21) println("Both of you went bust, nobody wins!")
    else if (dealer > 21) println("You win, the dealer went bust!")
    else if (player > 21) println("You lose, you went bust!")
    else cardCompare(player, dealer)
  }

  def cardCompare(player: Int, dealer: Int) = {
      if (player>dealer) println("You win!")
      else println("Dealer wins!")
  }

  dealBlackjack()
}
