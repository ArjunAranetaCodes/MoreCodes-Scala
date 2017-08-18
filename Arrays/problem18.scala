
import java.util.Arrays;
object Problem18{
 def main(args:Array[String]){
  var array1 = Array(1,3,2,4);
  Arrays.sort(array1);

  var array2 = new Array[Int](array1.length);
  var y = array1.length - 1;
  var x = 0;
  for(x <- 0 to array1.length - 1){
   array2(x) = array1(y);
   y = y - 1;
  }

  for(x <- 0 to array2.length - 1){
   println(array2(x));
  }
 }
}


