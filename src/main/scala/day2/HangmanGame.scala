package day2

import scala.io.Source
import scala.io.Source._

object HangmanGame {

  /*
  Steps for creating game of Hangman:
  - Computer selects a word from a pre-defined list of words
    - Split this word up and display each character as an _
  - Ask for user input to guess a letter
    - If this letter is not in the word, take a life off them, or update the hangman picture
    - Is this letter is in the word, reveal the location of the letter by replacing one of the _s
    - Continue iterating through this process until the user runs out of lives or gets the complete word.
    - Additional: Allow the user to guess the word if they think they know it.
   */

  def main(args: Array[String]): Unit = {

    def hangmanWord() = {
      val filename = "/home/qa-admin/Documents/hangmanwords.txt"
      var hiddenWord = Source.fromFile(filename).getLines().toArray
      for(i <- 0 to hiddenWord.length-1){
        println(hiddenWord(i))
      }

      val currentWord = hiddenWord(scala.util.Random.nextInt(hiddenWord.length))

      val success = new StringBuilder
      var lives = 11

      while (success.length() != currentWord.length) {

        val guess = scala.io.StdIn.readLine("Please guess a letter: ")
        println(guess)
        if (currentWord.contains(guess)) {
          success.append(guess)
          println(success)
        } else {
          lives -= 1
          println(s"You have $lives lives remaining")
          if (lives == 0) {
            println("You lose!")
          }


        }

      }

    }

    hangmanWord()
  }

}
