//Problem 7: Write a program that converts a decimal number to binary number.
object Problem7{
 def main(args:Array[String]){
  var dec = 10;
  var binary = "";

  while (dec > 0){
   binary = String.valueOf(dec % 2) + binary;
   dec = dec / 2;
  }
  println(binary);
 }
}
