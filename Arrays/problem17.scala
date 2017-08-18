
object Problem17{
 def main(args:Array[String]){
  var array1 = Array(1,2,3);
  var newArray = new Array[Int](array1.length + 1);
  var x = 0;

  for(x <- 0 to array1.length - 1){
   newArray(x) = array1(x);
  }
  newArray(newArray.length - 1) = 10;

  for(x <- 0 to newArray.length - 1){
   println(newArray(x));
  }
 }
}


