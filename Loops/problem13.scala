
object Problem13 {
 def main(args: Array[String]) {
   var word = "MoreCodes";
   var newWord = "";
   var x = 0;

   for (x <- word.length() - 1 to 0 by -1){
    newWord = newWord + word.charAt(x);
   }
   println(newWord);
 }
}

