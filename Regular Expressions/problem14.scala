//Problem 14: Write a program that recognizes valid hex color value using Regular Expression.
import java.util.regex.Pattern;  
object Problem {
 def main(args: Array[String]) {
    var word1 = "192.168.1.1";
    var word2 = "1.1.1.1.1";
    var pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                     "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    println(Pattern.matches(pattern, word1));
    println(Pattern.matches(pattern, word2));
  }
}