
import java.util.Arrays;
object Problem16{
 def main(args:Array[String]){
  var arrNumbers = Array(1,2,3,4);
  var n = 2;
  var tempNum = 0;
  var indexOfNum = 0;
  var x = 0;

  for(x <- 0 to arrNumbers.length - 1){
   if(arrNumbers(x) == 2){
    indexOfNum = arrNumbers(x);
   }
  }

  for(x <- 0 to arrNumbers.length - 1){
   if ((x >= indexOfNum) && (x < arrNumbers.length - 1)){
    arrNumbers(x) = arrNumbers(x + 1);
   }
  }

  arrNumbers(arrNumbers.length - 1) = 0;

  var newArray = Arrays.copyOf(arrNumbers,3);

  for(x <- 0 to newArray.length - 1){
   println(newArray(x));
  }
 }
}


