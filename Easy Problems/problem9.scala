
import java.util.Scanner;
object Problem9 {
 def main(args: Array[String]) {
  var num = 0;
  var sum = 0;
  var x = 0;

  var sc = new Scanner(System.in);
  print("Enter value of num: ");
  num = sc.nextInt();

  for(x <- 0 to num){
   sum = sum + x;
  }

  println("The sum of 1 to " + String.valueOf(num) +
  " is " + String.valueOf(sum));
 }
}


