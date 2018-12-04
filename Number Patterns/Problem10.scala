/*
Problem 10: Write a program to print the number pattern using loop.
12345
23456
34567
45678
56789
*/
object Problem {
 def main(args: Array[String]) {
  var row = 4;
  var col = 4;
  var min = 1;
  for(y <- 0 to row){
    var num = min + y;
    for(x <- 0 to col){
      print(num);
      num = num + 1;
    }
    println();
  }
 }
}