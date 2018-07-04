//Problem 13: Write a program that recognizes valid hex color value using Regular Expression.
import java.util.regex.Pattern;  
object Problem {
 def main(args: Array[String]) {
    var word1 = "#fff";
    var word2 = "#asdf";
    var pattern = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
    println(Pattern.matches(pattern, word1));
    println(Pattern.matches(pattern, word2));
  }
}