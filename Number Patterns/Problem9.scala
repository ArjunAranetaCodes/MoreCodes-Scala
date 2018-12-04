/*
Problem 9: Write a program to print the number pattern of ones and zeros using loop.
11011
11011
00000
11011
11011
*/
object Problem {
 def main(args: Array[String]) {
  var row = 4;
  var col = 4;
  for(y <- 0 to row){
   for(x <- 0 to col){
    var newcol = Math.floor(col / 2);
    var newrow = Math.floor(row / 2);
    if(newcol == x || newrow == y){
        print("0");
    }else if((col % 2 == 0 && newcol == x) || (row % 2 == 0 && newrow == y)){
        print("0");
    }else{
        print("1");
    }		
   }
   print("\n");
  }
 }
}