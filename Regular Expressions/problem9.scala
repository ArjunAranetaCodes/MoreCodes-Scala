//Problem 9: Write a program that checks if the string is alphanumeric using Regular Expression.
import java.util.regex.Pattern;  
object Problem {
 def main(args: Array[String]) {
    var word = "HelloWorld";
    var word2 = "HelloWorld123";
    var pattern = Pattern.compile("(([A-Z].*[0-9])|([0-9].*[A-Z]))");
    var isalphanum = pattern.matcher(word).find();
    println(isalphanum);
    var isalphanum2 = pattern.matcher(word2).find();
    println(isalphanum2);
  }
}