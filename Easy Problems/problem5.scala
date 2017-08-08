
import java.util.Scanner;
object Problem5 {
 def main(args: Array[String]) {
  var celsius = 0.0;
  var farenheit = 0.0;

  var sc = new Scanner(System.in);
  print("Enter value of celsius: ");
  celsius = sc.nextFloat();

  farenheit = (9.0/5.0) * celsius + 32.0;

  println();
  println(celsius + "C equals to "  + farenheit + "F");
 }
}


