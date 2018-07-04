//Problem 17: Write a program that removes the last word in a string using Regular Expression.
import java.util.regex.Pattern;  
object Problem {
 def main(args: Array[String]) {
    var word = "Hello World";
    var newWord = word.replaceAll("\\w+$", "");
    println(newWord);
  }
}