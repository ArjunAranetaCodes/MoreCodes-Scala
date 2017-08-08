
import java.util.Scanner;
object Problem4 {
 def main(args: Array[String]) {
  var radius = 0.0;
  var dia = 0.0;
  var pi = 3.14;
  var area = 0.0;
  var cir = 0.0;

  var sc = new Scanner(System.in);
  print("Enter value of radius: ");
  radius = sc.nextFloat();
  dia = radius * radius;
  area = pi * dia;
  cir = 2.0 * pi * radius;


  println();
  println("Diamter of Circle is "  + dia);
  println("Area of Circle is "  + area);
  println("Circumference of Circle is "  + cir);
 }
}


