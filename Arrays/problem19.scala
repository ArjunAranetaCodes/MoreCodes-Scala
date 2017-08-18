
object Problem19{
 def main(args:Array[String]){
  var array1 = Array(1, 2, 3);
  var array2 = Array(1, 2, 3);

  var merge = new Array[Int](array1.length + array2.length);
  var x = 0;
  for (x <- 0 to array1.length - 1) {
   merge(x) = array1(x);
  }

  for (x <- 0 to array2.length - 1) {
   merge(x + array2.length) = array2(x);
  }

  for(x <- 0 to merge.length - 1){
   println(merge(x));
  }
 }
}


