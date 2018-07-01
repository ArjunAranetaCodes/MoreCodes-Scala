//Problem 7: Write a program that counts vowels in a String using Regular Expression.
object Problem {
 def main(args: Array[String]) {
    var word = "Hello World";
    var count = word.replaceAll("[^aeiouAEIOU]","").length();
    println(count);
  }
}