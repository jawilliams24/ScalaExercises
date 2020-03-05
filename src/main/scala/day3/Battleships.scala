package day3

object Battleships{

  def main(args: Array[String]): Unit = {
    println("Welcome to Battleships!")
    var playerBoard = new BattleBoard()
    playerBoard.boardPrinter()
  }

}
