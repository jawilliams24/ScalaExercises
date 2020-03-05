package day2

import scala.collection.mutable.ListBuffer
import scala.io.Source

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
    - How to add functionality such that if a letter appears more than once, it's filled in that many times
   */

  def main(args: Array[String]): Unit = {

    def hangmanWord() = {
      val filename = "/home/qa-admin/Documents/hangmanwords.txt"
      var hiddenWord = Source.fromFile(filename).getLines().toList
      val currentWord = hiddenWord(scala.util.Random.nextInt(hiddenWord.length)).toLowerCase
      val guessWord = currentWord
      val success = new StringBuilder
      var lives = 11
      var guessList = ListBuffer[Char]()
      val wordLength = currentWord.length
      var playing = true
      println(s"The word is $wordLength letters long")
      while (playing) {

        while (success.length() != currentWord.length) {

          val guess = scala.io.StdIn.readLine("Please guess a letter: ").head
          if (guessList.contains(guess)) {
            println("You've already guessed that letter, guess again!")
          }
          guessList += guess
          if (currentWord.contains(guess)) {
            success.append(guess)
            println(success)
            if (success.length == currentWord.length) {
              guess == currentWord
              playing == false
              println(s"The word was $guessWord")
              println("Congratulations, you win!")
            }
          } else {
            lives -= 1
            println(s"You have $lives lives remaining")
            if (lives == 0) {
              playing == false
              println("You lose!")
            }
          }
        }
      }
    }

    hangmanWord()
  }
}
