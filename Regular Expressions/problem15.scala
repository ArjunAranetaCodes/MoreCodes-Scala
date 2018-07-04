//Problem 15: Write a program that takes a value inside a <div> tag using Regular Expression.
import java.util.regex.Pattern;  
object Problem {
 def main(args: Array[String]) {
    var word = "<div>Hello World</div>";
    var newWord = word.replaceAll("<(\"[^\"]*\"|\'[^\']*\'|[^\'\">])*>", "");
    println(newWord);
  }
}