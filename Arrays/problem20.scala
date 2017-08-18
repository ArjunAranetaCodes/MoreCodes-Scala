
import java.lang.Math;
object Problem20{
 def main(args:Array[String]){
  var arrNumbers = Array(4, 3, 2, 1);
  var closest = 0;
  var numDiff = arrNumbers(0);
  var x = 0;

  for(x <- 0 to arrNumbers.length - 1){
   var diff = 0 - arrNumbers(x);
   diff = Math.abs(diff);
   if(diff < numDiff){
    numDiff = diff;
    closest = arrNumbers(x);
   }
  }

  println("Closest to 0 is " +
   String.valueOf(closest));
 }
}


