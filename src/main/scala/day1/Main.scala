package day1

object Main {

 def endString(word:String, num:Int):String = {
   var wordEnd = ""
   for(i <- (word.length()-num) until word.length()){
     wordEnd += word.charAt(i)
   }
   wordEnd
 }
}
