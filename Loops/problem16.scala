
object Problem16 {
 def main(args: Array[String]) {
   var num = 5;
   var fact = 1;
   var x = 0;

   for (x <- num to 1 by -1){
    fact = fact * x;
   }
   print("Factorial of 5 is " + String.valueOf(fact));
 }
}

