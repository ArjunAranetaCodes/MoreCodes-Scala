//Problem 8: Write a program that checks if the String if valid url using Regular Expression.
import java.util.regex.Pattern;  
object Problem {
 def main(args: Array[String]) {
    var word = "http://www.example.com";
    var word2 = "wwwexamplecom";
    var pattern = "^(https?:\\/\\/)?(www\\.)?([\\w]+\\.)+[‌​\\w]{2,63}\\/?$";
    println(Pattern.matches(pattern, word));
    println(Pattern.matches(pattern, word2));
  }
}