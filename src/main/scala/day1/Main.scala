package day1

object Main {

 def endString(word:String, num:Int):String = {
   var wordEnd = ""
   for(i <- word.length() to (word.length()-num)){
     wordEnd += word.charAt(i)
   }
 }

}
