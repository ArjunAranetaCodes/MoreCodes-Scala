
object Problem18{
 def main(args: Array[String]){
  var word = "program";
  var letter = "a";
  var letterCount = 0;

  var x = 0;
  for( x <- 0 to word.length() - 1){
   if(letter.contains(String.valueOf(word.charAt(x)))){
    letterCount += 1;
   }
  }

  println("Total: " + String.valueOf(letterCount));
 }
}


