//Problem 8: Write a program that converts a decimal number to hexadecimal number.
object Problem8{
 def main(args:Array[String]){
  var dec = 256;
  var hex = "";

  while (dec > 0){
   hex = String.valueOf(dec % 16) + hex;
   dec = dec / 16;
  }
  println(hex);
 }
}
