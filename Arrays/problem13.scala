
object Problem13{
 def main(args:Array[String]){
  var arrNumbers = Array(1, 2, 3, 4);
  var x = 0;

  for(x <- 0 to arrNumbers.length - 1){
   if(x % 2 == 0){
    println(x);
   }
  }
 }
}


