/*
Problem 11: Write a program to print the pattern of asterisks using loop.
*
**
***
****
*****
*/
object Problem {
 def main(args: Array[String]) {
	var row = 4;
	for(y <- 0 to row){
		for(x <- 0 to y){
			print("*");
		}
		print("\n");
	}
 }
}