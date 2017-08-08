
object Problem7 {
 def main(args: Array[String]) {
  var sum = 0;
  var x = 0

  for( x <- 0 to 20){
   sum = sum + x;
  }

  println("Sum of 1 to 20 " +
   String.valueOf(sum));
 }
}


