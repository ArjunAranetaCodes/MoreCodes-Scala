/*
Problem 5: Write a program to print the number pattern of ones and zeros using loop.
11111
00000
00000
00000
11111
*/
object Problem {
 def main(args: Array[String]) {
  var y = 0;
  for(y <- 0 to 4){
   var x = 0;
   for(x <- 0 to 4){
    if((y == 0) || (y == 4)){
     print("1");
    }else{
     print("0");
    }			
   }
   print("\n");
  }
 }
}