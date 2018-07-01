//Problem 6: Write a program that removes white space and non-visible characters.
import java.util.regex.Pattern;  
object Problem {
 def main(args: Array[String]) {
    var word = "Hello World";
    var newWord = word.replaceAll("\\s", "");
    println(newWord);
  }
}