
object Problem3{
 def main(args:Array[String]){
  var arrNumbers = Array(1,1,2,3);
  var count = 0;
  var x = 0;

  for(x <- 0 to arrNumbers.length - 1){
   if(x == 1){
    count = count + 1;
   }
  }

  print("Occurence: " +
   String.valueOf(count));
 }
}


