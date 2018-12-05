/*
Problem 15: Write a program to print the number pattern using loop.
11111
2222
333
44
5
*/
object Problem {
 def main(args: Array[String]) {
		var row = 5;
		var num = 1;
		for(y <- row to 1 by -1){
			for(x <- 1 to y){
				print(num);
			}
			num = num + 1;
			println();
		}
 }
}