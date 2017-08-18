
import java.util.Arrays;
object Problem15{
 def main(args:Array[String]){
  var array1 = Array(1,2,3);
  var array2 = new Array[Int](3);
  var x = 0;

  array2 = Arrays.copyOf(array1,3);

  for(x <- 0 to array2.length - 1){
   println(array2(x));
  }
 }
}


