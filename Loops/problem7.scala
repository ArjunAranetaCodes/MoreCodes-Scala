
object Problem7 {
 def main(args: Array[String]) {
   var n = 10;
   var sum = 0;
   for (x <- 0 to n){
    sum = sum + x;
   }
   println("Sum is " + String.valueOf(sum));
 }
}

