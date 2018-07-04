//Problem 20: Write a program that validates if string length is between 5 to 10 using Regular Expression.
import java.util.regex.Pattern;  
object Problem {
 def main(args: Array[String]) {
    println(Pattern.matches("\\w{5,10}\\b", "Hello"));
    println(Pattern.matches("\\w{5,10}\\b", "Hi"));
  }
}