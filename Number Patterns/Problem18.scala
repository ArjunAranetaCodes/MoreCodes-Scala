/*
Problem 18: Write a program to print the number pattern using loop.
  1  
 111
11111
 111
  1
*/
object Problem {
 def main(args: Array[String]) {
		var y = 0;
		var x = 0;
		var rows = 3;
		var ones = 0; 
		var blank = rows - 1;

		for(y <- 1 to rows * 2){
			for(x <- 1 to blank){
				print(" ");
			}

			for(x <- 0 to ones * 2){
				print("1");
			}

			print("\n");

			if(y<rows){
				blank = blank - 1;
				ones = ones + 1;
			}else{
				blank = blank + 1;
				ones = ones - 1;
			}
		}
 }
}