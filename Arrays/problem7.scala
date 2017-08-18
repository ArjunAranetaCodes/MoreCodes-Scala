
object Problem7{
 def main(args:Array[String]){
  var arrNumbers = Array(1, 2, 3);
  var max = 0;
  var x = 0;

  for(x <- 0 to arrNumbers.length - 1){
   if(arrNumbers(x) > max){
    max = x;
   }
  }

  println("Largest number: " +
   String.valueOf(max));
 }
}


