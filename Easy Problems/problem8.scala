
object Problem8 {
 def main(args: Array[String]) {
  var sum = 0;
  var x = 0;

  for(x <- 0 to 30){
   if(x % 5 == 0){
    sum = sum + x;
   }
  }

  println("Sum of numbers divisible by 5 from 1 to 30 is " +
   String.valueOf(sum));
 }
}


