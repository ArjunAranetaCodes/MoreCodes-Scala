//Problem 4: Write a program that converts a string to array/list.
object Problem4{
 def main(args:Array[String]){
  var numbers = "1,2,3";
  var arrNumbers = numbers.split(",");
  for(x <- 0 to arrNumbers.length - 1){
   println(arrNumbers(x));
  }
 }
}
