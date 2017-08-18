
object Problem6{
 def main(args:Array[String]){
  var arrNumbers = Array(1,2,3);
  var count = 0;
  var x = 0;

  for(x <- 0 to arrNumbers.length - 1){
   if(arrNumbers(x) == 2){
    count = count + 1;
   }
  }

  if(count > 0){
   println("Contains 2");
  }else{
   println("Does not contain 2");
  }
 }
}


