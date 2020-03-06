package day5

import scala.util

object RPSLS extends App {

  var rockCount = 0
  var paperCount = 0
  var scissorsCount = 0
  var lizardCount = 0
  var spockCount = 0
  var playerWin = 0
  var computerWin = 0
  var playCount = 0
  var playing = true

  def optionChooser(): Unit = {
    val playerChoice = scala.io.StdIn.readLine("Please pick an option between rock, paper, scissors, lizard or spock: ").toLowerCase()
    val choiceList: List[String] = List("rock", "paper", "scissors", "lizard", "spock")
    val r = scala.util.Random.nextInt(5)
    val computerChoice = choiceList(r)
    optionCompare(playerChoice, computerChoice)
  }

  def optionCompare(playerChoice: String, computerChoice: String): Unit = {

    def stillPlaying(playCount: Int): Unit = {
      if (playCount > 9) playing = !playing
      playing
    }

    while (playing) {

      playerChoice match {

        case ("rock")
        => rockChosen(playerChoice: String, computerChoice: String)
          playCount += 1
          stillPlaying(playCount: Int)
          optionChooser()

        case ("paper")
        => paperChosen(playerChoice: String, computerChoice: String)
          playCount += 1
          stillPlaying(playCount: Int)
          optionChooser()
        case ("scissors")
        =>
          scissorsChosen(playerChoice: String, computerChoice: String)
          playCount += 1
          stillPlaying(playCount: Int)
          optionChooser()
        case ("lizard")
        =>
          lizardChosen(playerChoice: String, computerChoice: String)
          playCount += 1
          stillPlaying(playCount: Int)
          optionChooser()
        case ("spock")
        =>
          spockChosen(playerChoice: String, computerChoice: String)
          playCount += 1
          stillPlaying(playCount: Int)
          optionChooser()
      }
    }

    def rockChosen(playerChoice: String, computerChoice: String): Unit = {
      rockCount += 1
      computerChoice match {
        case ("rock") => println("You draw, you both picked rock!")
        case ("paper") => println("You lose, paper covers rock!")
          computerWin += 1
        case ("scissors") => println("You win, rock crushes scissors!")
          playerWin += 1
        case ("lizard") => println("You win, rock crushes lizard!")
          playerWin += 1
        case ("spock") => println("You lose, spock vaporises rock!")
          computerWin += 1
      }
    }

    def paperChosen(playerChoice: String, computerChoice: String): Unit = {
      paperCount += 1
      computerChoice match {
        case ("rock") => println("You win, paper covers rock!")
          playerWin += 1
        case ("paper") => println("You draw, you both picked paper!")
        case ("scissors") => println("You lose scissors cut paper!")
          computerWin += 1
        case ("lizard") => println("You lose, lizard eats paper!")
          computerWin += 1
        case ("spock") => println("You win, paper disproves spock!")
          playerWin += 1
      }
    }

    def scissorsChosen(playerChoice: String, computerChoice: String): Unit = {
      scissorsCount += 1
      computerChoice match {
        case ("rock") => println("You lose, rock cruses scissors!")
          computerWin += 1
        case ("paper") => println("You win, scissors cut paper!")
          playerWin += 1
        case ("scissors") => println("You draw, you both picked scissors!")
        case ("lizard") => println("You win, scissors decapitates lizard!")
          playerWin += 1
        case ("spock") => println("You lose, spock smashes scissors!")
          computerWin +=1
      }
    }

    def lizardChosen(playerChoice: String, computerChoice: String): Unit = {
      lizardCount += 1
      computerChoice match {
        case ("rock") => println("You lose, rock crushes lizard!")
          computerWin += 1
        case ("paper") => println("You win, lizard eats paper!")
          playerWin += 1
        case ("scissors") => println("You lose, scissors decapitates lizard!")
          computerWin += 1
        case ("lizard") => println("You draw, you both picked lizard!")
        case ("spock") => println("You win, lizard poisons spock!")
          playerWin += 1
      }
    }

    def spockChosen(playerChoice: String, computerChoice: String): Unit = {
      spockCount += 1
      computerChoice match {
        case ("rock") => println("You win, spock vaporises rock!")
          playerWin += 1
        case ("paper") => println("You lose, paper disproves spock!")
          computerWin += 1
        case ("scissors") => println("You win, spock smashes scissors!")
          playerWin += 1
        case ("lizard") => println("You lose, lizard poisons spock!")
          computerWin += 1
        case ("spock") => println("You draw, you both picked spock!")
      }
    }

  }

  def rockCheck(rockCount: Int): Unit = {
    if(rockCount > 3) {

    }
  }

  optionChooser()
}
