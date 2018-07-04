//Problem 19: Write a program that counts all numbers in a string using Regular Expression.
import java.util.regex.Pattern;  
object Problem {
 def main(args: Array[String]) {
    var word = "Hello World123";
    var count = word.replaceAll("[^0-9]","").length();
    println(count);
  }
}