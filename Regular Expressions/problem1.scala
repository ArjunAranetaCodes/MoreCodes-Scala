//Problem 1: Write a program to test if the first character of the String is uppercase.
import java.util.regex.Pattern;  
object Problem {
 def main(args: Array[String]) {
    println(Pattern.matches("^[A-Z][a-z0-9_-]{3,19}$", "Hello"));
    println(Pattern.matches("^[A-Z][a-z0-9_-]{3,19}$", "world"));
  }
}