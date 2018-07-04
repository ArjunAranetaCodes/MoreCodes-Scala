//Problem 11: Write a program that counts the occurrence of a string in a string using Regular Expression.
import java.util.regex.Pattern;  
object Problem {
 def main(args: Array[String]) {
    var hello = "HelloWorldHelloWorld";
    var pattern = Pattern.compile("Hello");
    var  matcher = pattern.matcher(hello);

    var count = 0;
    while (matcher.find())
        count = count + 1;

    println(count);
  }
}