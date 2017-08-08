
object Problem12 {
 def main(args: Array[String]) {
   var num1 = 3;
   var num2 = 5;
   var prod = 0;
   var x = 0;

   for (x <- 1 to num2){
    prod = prod + num1;
   }
   println("3 * 5 = " + String.valueOf(prod));
 }
}

