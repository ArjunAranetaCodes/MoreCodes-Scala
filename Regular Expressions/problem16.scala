//Problem 16: Write a program that takes a value inside a <a> tag using Regular Expression.
import java.util.regex.Pattern;  
object Problem {
 def main(args: Array[String]) {
    var word = "<a>Hello World</a>";
    var newWord = word.replaceAll("<(\"[^\"]*\"|\'[^\']*\'|[^\'\">])*>", "");
    println(newWord);
  }
}