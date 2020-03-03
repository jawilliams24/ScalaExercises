package day2

import scala.collection.mutable.ListBuffer
import scala.io.Source._

object LongestWord extends App {

  def brokenKeyboards(): Unit = {

    val numberOfBrokenKeyboards = scala.io.StdIn.readLine("Please enter the number of broken keyboards you have: ").toInt
    val keyboards = new Array[String](numberOfBrokenKeyboards)
    for (i <- 0 until numberOfBrokenKeyboards) {
      keyboards(i) = scala.io.StdIn.readLine("What keys can you press on this keyboard?")
    }

    val words = "fileopen.scala"
    val lines = fromFile("/home/qa-admin/Downloads/enable1.txt").getLines

    for (keyboard <- keyboards) {
      var wordList = ListBuffer[String]()
      for (line <- lines) {
        val uniqueLetters = line.toSeq.distinct.unwrap
        if (keyboard.contains(uniqueLetters)) {
          wordList += line
        }
      }
      if (wordList.nonEmpty) {
        println(wordList.maxBy(_.length))
      }
    }

  }

  brokenKeyboards()

}
