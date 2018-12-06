/*
Problem 19: Write a program to print the number pattern using loop.
11 11
11 11
   
11 11
11 11
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
					print(" ");
				}else if((col % 2 == 0 && newcol == x) || 
				 (row % 2 == 0 && newrow == y)){
				 print(" ");
				}else{
				 print("1");
				}		
			}
			print("\n");
		}
 }
}