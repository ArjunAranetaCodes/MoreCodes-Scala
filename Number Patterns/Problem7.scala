/*
Problem 7: Write a program to print the number pattern of ones and zeros using loop.
10101
01010
10101
01010
10101
*/
object Problem {
 def main(args: Array[String]) {
  var y = 0;
  var count = 0;
  for(y <- 0 to 4){
   var x = 0;
   for(x <- 0 to 4){
    count += 1;
    if(count % 2 == 1){
     print("1");
    }else{
     print("0");
    }			
   }
   print("\n");
  }
 }
}