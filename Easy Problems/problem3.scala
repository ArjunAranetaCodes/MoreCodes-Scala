
import java.util.Scanner;
object Problem3 {
 def main(args: Array[String]) {
  var length = 0;
  var width = 0;
  var area = 0;

  var sc = new Scanner(System.in);
  print("Enter value of length: ");
  length = sc.nextInt();
  print("Enter value of width: ");
  width = sc.nextInt();
  area = length * width;

  println();
  println("Area of Rectangle is "  + area);
 }
}


