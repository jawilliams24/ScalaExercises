package day3

class BattleBoard {

  def getDifficulty(): Int = {
    var validInput = false
    var difficulty = 0
    while (!validInput) {
      println("Difficulty levels are as follows:")
      println("1 - Easy - 8 by 8 grid")
      println("2 - Medium - 12 by 12 grid")
      println("3 - Hard - 16 by 16 grid")
      val difficultyInput = scala.io.StdIn.readLine("What difficulty would you like to play on? ")
      if (difficultyInput == "1" || difficultyInput == "2" || difficultyInput == "3") {
        difficulty = difficultyInput.toInt
        validInput = true
      } else println("Please enter a valid difficulty level")
    }
    difficulty
  }

  def boardBuilder(): Array[Array[String]] = {
    val difficulty = getDifficulty()
    var height = 0
    var width = 0

    if (difficulty == 1) {
      width = 8
      height = width
    } else if (difficulty == 2) {
      width = 12
      height = width
    } else if (difficulty == 3) {
      width = 16
      height = width
    }
    Array.ofDim[String](height, width)

  }

  def boardPrinter(): Unit = {
    val board = boardBuilder()
    val size = board.length
    for (i <- 0 until size) {
      for (j <- 0 until size) {
        board(i)(j) = " [] "
        print(board(i)(j))
      }
      print("\n")
    }
  }


}
