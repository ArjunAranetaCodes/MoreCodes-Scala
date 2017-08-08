
import java.util.Scanner;
object Problem6 {
 def main(args: Array[String]) {
  var num = 0;

  var sc = new Scanner(System.in);
  print("Enter value of num: ");
  num = sc.nextInt();

  if(num % 2 == 0){
   println("Number is even");
  }else{
   println("Number is odd");
  }
 }
}


