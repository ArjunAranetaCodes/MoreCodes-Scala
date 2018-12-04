/*
Problem 3: Write a program to print the number pattern of ones and zeros using loop.
01010
01010
01010
01010
01010
*/
object Problem {
 def main(args: Array[String]) {
  var y = 0;
  for(y <- 0 to 4){
   var x = 0;
   for(x <- 0 to 4){
    if(x % 2 == 0){
     print("0");
    }else{
     print("1");
    }			
   }
   print("\n");
  }
 }
}