//Problem 3: Write a program that checks if string contains sample format date of (yyyy-mm-dd)
import java.util.regex.Pattern;  
object Problem {
 def main(args: Array[String]) {
    println(Pattern.matches("([0-9]{4})-([0-9]{2})-([0-9]{2})", "2018-01-02"));
    println(Pattern.matches("([0-9]{4})-([0-9]{2})-([0-9]{2})", "01-01-02"));
  }
}