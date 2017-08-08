
import java.util.Scanner;
object Problem14 {
 def main(args: Array[String]) {
   var scan = new Scanner(System.in);
   var num = 0;
   var sum = 0;
   var ave = 0;
   var x = 0;

   for (x <- 0 to 4){
    print("Enter a number: ");
    num = scan.nextInt();
    sum = sum + num;
   }
   ave = sum / 5;
   println("Average is " + String.valueOf(ave));
 }
}

