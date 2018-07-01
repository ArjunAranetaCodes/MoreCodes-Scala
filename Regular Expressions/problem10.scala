//Problem 10: Write a program that prints an integer with commas separator using Regular Expression.
import java.util.regex.Pattern;  
object Problem {
 def main(args: Array[String]) {
    var number = "1000";
    var newnum = number.replaceAll("(\\d)(?=(\\d{3})+$)", "$1,");
    println(newnum);
  }
}