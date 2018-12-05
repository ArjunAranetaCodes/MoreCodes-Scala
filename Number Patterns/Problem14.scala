/*
Problem 14: Write a program to print the number pattern using loop.
1
22
333
4444
55555
*/
object Problem {
 def main(args: Array[String]) {
		var row = 5;
		for(y <- 1 to row){
			for(x <- 1 to y){
				print(y);
			}
			println();
		}
 }
}