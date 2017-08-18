
object Problem2{
 def main(args:Array[String]){
  var arrNumbers = Array(1,2,3);
  var indexOfNum =  0;
  var x = 0;

  for(x <- 0 to arrNumbers.length - 1){
   if(arrNumbers(x) == 2){
    indexOfNum = x;
   }
  }

  println(indexOfNum);
 }
}


