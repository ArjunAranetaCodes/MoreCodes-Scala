
object Problem9 {
 def main(args: Array[String]) {
   var num = 2;
   var x = 0;
   for (x <- 0 to 10){
    println(String.valueOf(num) + " x " +
     String.valueOf(x) + " = " + String.valueOf(num * x));
   }
 }
}

