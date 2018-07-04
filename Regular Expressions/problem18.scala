//Problem 18: Write a program that extracts string inside quotation marks using Regular Expression.
import java.util.regex.Pattern;  
import java.util.regex.Matcher;  
object Problem {
 def main(args: Array[String]) {
    var word = "Hello 'World'";
    var pattern = Pattern.compile("\'([^\"]*)\'");
    var match = pattern.matcher(word);
    match.find();
    println(match.group(0));
  }
}