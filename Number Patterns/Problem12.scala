/*
Problem 12: Write a program to print the pattern of asterisks using loop.
*****
****
***
**
*
*/
object Problem {
 def main(args: Array[String]) {
	var row = 4;
		for(y <- row to 0 by -1){
			for(x <- 0 to y){
				print("*");
			}
			print("\n");
		}
 }
}