/*
Problem 8: Write a program to print the number pattern of ones and zeros using loop.
11111
11111
11011
11111
11111
*/
object Problem {
 def main(args: Array[String]) {
  var row = 4;
  var col = 4;
  for(y <- 0 to row){
   for(x <- 0 to col){
    if(x == Math.floor(row / 2) && y == Math.floor(col / 2)){
     print("0");
    }else{
     print("1");
    }			
   }
   print("\n");
  }
 }
}