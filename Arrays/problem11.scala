
object Problem11{
 def main(args:Array[String]){
  var arrNumbers = Array(1, 2, 3);
  var array2 = new Array[Int](3);

  var y = arrNumbers.length - 1;
  var x = 0;
  for(x <- 0 to arrNumbers.length - 1){
   array2(x) = arrNumbers(y);
   y = y - 1;
  }

  for(x <- 0 to array2.length - 1){
   println(array2(x));
  }
 }
}


