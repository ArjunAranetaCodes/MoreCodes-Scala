
object Problem8{
 def main(args:Array[String]){
  var arrNumbers = Array(1, 2, 3);
  var min = arrNumbers(0);
  var x = 0;

  for(x <- 0 to arrNumbers.length - 1){
   if(arrNumbers(x) < min){
    min = x;
   }
  }

  println("Lowest number: " +
   String.valueOf(min));
 }
}


