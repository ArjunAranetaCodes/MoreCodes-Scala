
object Problem3 {
 def main(args: Array[String]) {
  var word = "MoreCodes";
  var wordCount = 0;

  for (ch <- word) {
   wordCount = wordCount + 1;
  }

  print("String Length: " + String.valueOf(wordCount));
 }
}

