
import java.util.Scanner;
object Problem10 {
 def main(args: Array[String]) {
  var num1 = 0;
  var num2 = 0;
  var num3 = 0;
  var ave = 0;

  var sc = new Scanner(System.in);
  print("Enter value of num1: ");
  num1 = sc.nextInt();
  print("Enter value of num2: ");
  num2 = sc.nextInt();
  print("Enter value of num3: ");
  num3 = sc.nextInt();
  ave = (num1 + num2 + num3) / 3;

  println();
  println("Average is "  + ave);
 }
}


