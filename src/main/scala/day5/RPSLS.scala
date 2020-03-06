package day5

import scala.util

object RPSLS extends App {

  def optionChooser(): Unit = {
    val playerChoice = scala.io.StdIn.readLine("Please pick an option between rock, paper, scissors, lizard or spock: ")
    val choiceList: List[String] = List("rock", "paper", "scissors", "lizard", "spock")
    val r = scala.util.Random.nextInt(5)
    val computerChoice = choiceList(r)
    optionCompare(playerChoice, computerChoice)
  }

  def optionCompare(playerChoice: String, computerChoice: String): Unit = {
    var rockCount = 0
    var paperCount = 0
    var scissorsCount = 0
    var lizardCount = 0
    var spockCount = 0
    var playing = true
    while (playing) {

      playerChoice match {

        case ("rock")
        => rockCount += 1
          playing = !playing
          computerChoice match {
            case ("rock") => println("You draw, you both picked rock!")
            case ("paper") => println("You lose, paper covers rock!")
            case ("scissors") => println("You win, rock crushes scissors!")
            case ("lizard") => println("You win, rock crushes lizard!")
            case ("spock") => println("You lose, spock vaporises rock!")
          }
        case ("paper")
        => paperCount += 1
          playing = !playing
          computerChoice match {
            case ("rock") => println("You win, paper covers rock!")
            case ("paper") => println("You draw, you both picked paper!")
            case ("scissors") => println("You lose scissors cut paper!")
            case ("lizard") => println("You lose, lizard eats paper!")
            case ("spock") => println("You win, paper disproves spock!")
          }
        case ("scissors")
        => scissorsCount += 1
          playing = !playing
          computerChoice match {
            case ("rock") => println("You lose, rock cruses scissors!")
            case ("paper") => println("You win, scissors cut paper!")
            case ("scissors") => println("You draw, you both picked scissors!")
            case ("lizard") => println("You win, scissors decapitates lizard!")
            case ("spock") => println("You lose, spock smashes scissors!")
          }
        case ("lizard")
        => lizardCount += 1
          playing = !playing
          computerChoice match {
            case ("rock") => println("You lose, rock crushes lizard!")
            case ("paper") => println("You win, lizard eats paper!")
            case ("scissors") => println("You lose, scissors decapitates lizard!")
            case ("lizard") => println("You draw, you both picked lizard!")
            case ("spock") => println("You win, lizard poisons spock!")
          }
        case ("spock")
        => spockCount += 1
          playing = !playing
          computerChoice match {
            case ("rock") => println("You win, spock vaporises rock!")
            case ("paper") => println("You lose, paper disproves spock!")
            case ("scissors") => println("You win, spock smashes scissors!")
            case ("lizard") => println("You lose, lizard poisons spock!")
            case ("spock") => println("You draw, you both picked spock!")
          }

      }
//      if (rockCount > 10 | paperCount > 10 | scissorsCount > 10 | lizardCount > 10 | spockCount > 10) {
//        playing = true
//        optionChooser()
//      }
    }
  }

  optionChooser()

}
