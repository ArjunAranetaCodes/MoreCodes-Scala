/*
Problem 20: Write a program to print the number pattern using loop.
  1
 222
33333
 444
  5
*/
object Problem {
 def main(args: Array[String]) {
		var y = 0;
		var x = 0;
		var rows = 3;
		var nums = 0; 
		var blank = rows - 1;

		for(y <- 1 to rows * 2){
			for(x <- 1 to blank){
				print(" ");
			}

			for(x <- 0 to nums * 2){
				print(y);
			}

			print("\n");

			if(y<rows){
				blank = blank - 1;
				nums = nums + 1;
			}else{
				blank = blank + 1;
				nums = nums - 1;
			}
		}
 }
}