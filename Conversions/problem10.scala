//Problem 10: Write a program that converts a decimal number to octal number.
object Problem10{
 def main(args:Array[String]){
  var dec = 256;
  var oct = "";

  while (dec > 0){
   oct = String.valueOf(dec % 8) + oct;
   dec = dec / 8;
  }
  println(oct);
 }
}
