/*
Problem 16: Write a program to print the number pattern using loop.
12345
1234
123
12
1
*/
object Problem {
 def main(args: Array[String]) {
		var row = 4;
		for(y <- row to 0 by -1){
			for(x <- 0 to y){
				print(x + 1);
			}
			print("\n");
		}
 }
}