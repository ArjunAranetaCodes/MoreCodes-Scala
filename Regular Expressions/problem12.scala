//Problem 12: Write a program that counts the occurrence of digits in a string using Regular Expression.
import java.util.regex.Pattern;  
object Problem {
 def main(args: Array[String]) {
    var word = "Hello12 World12";
    var newWord = word.replaceAll("\\D", "");
    var count = newWord.length();

    println(count);
  }
}