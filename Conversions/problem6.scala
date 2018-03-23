//Problem 6: Write a program that converts a binary number to decimal number.
object Problem6{
 def main(args:Array[String]){
  var dec = 0;
  var binary = "110";

  var reverse = new StringBuffer(binary).reverse().toString();

  for (x <- 0 to reverse.length() - 1){
   if (reverse.charAt(x) == '1'){
    dec = dec + math.pow(2, x).toInt;
   }
  }

  println(dec);
 }
}
