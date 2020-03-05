package day4

object TooHot extends App {

  def summerCheck(): Boolean = {
    scala.io.StdIn.readLine("Is it Summer? Please enter true or false: ").toBoolean
  }

  def temperatureCheck(): Unit = {
    var isSummer: Boolean = summerCheck()
    var temperature = scala.io.StdIn.readLine("What is the temperature? ").toInt
    println(temperature)
    if (isSummer) {
      if (temperature <= 100) {
        if (temperature >= 60) println("Just right!")
        else println("Too cold!")
      } else println("Too hot!")
    } else {
      if (temperature <= 90) {
        if (temperature >= 60) println("Just right!")
        else println("Too cold!")
      } else println("Too hot!")
    }
  }

  temperatureCheck()

}
