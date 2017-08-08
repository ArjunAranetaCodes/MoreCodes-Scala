
object Problem8 {
 def main(args: Array[String]) {
  var word = "program";
  var vowels = "aeiou";
  var vowelCount = 0;
  var x = 0;

  for(x <- 0 to word.length() - 1){
   if(vowels.contains(String.valueOf(word.charAt(x)))){
    vowelCount += 1;
   }
  }

  println("Total: " + String.valueOf(vowelCount));
 }
}

