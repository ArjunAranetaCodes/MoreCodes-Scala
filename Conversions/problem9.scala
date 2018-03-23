//Problem 9: Write a program that converys a hexadecimal number to decimal number.
object Problem9{
 def main(args:Array[String]){
  var dec = 0;
  var hex = "100";

  var reverse = new StringBuffer(hex).reverse().toString();

  for (x <- 0 to reverse.length() - 1){
   dec = dec + ((String.valueOf(reverse.charAt(x)).toInt) *
    Math.pow(16, x).toInt);
  }

  println(dec);
 }
}
