
object Problem9{
 def main(args:Array[String]){
  var arrNumbers = Array(1, 2, 3);
  var sum = 0;
  var x = 0;

  for(x <- 0 to arrNumbers.length - 1){
   sum = sum + arrNumbers(x);
  }

  println("Sum is " + String.valueOf(sum));
 }
}


