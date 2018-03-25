//Problem 19: Write a program that converts numbers to words.
object Problem19{
 def main(args:Array[String]){
  println(NumberToWords(1000, ""));
 }

 def NumberToWords(number :Int, word :String) :String = {
  if((number >= 1) && (number <= 19)){
   var map = Array("One", "Two", "Three", "Four", "Five", "Six", "Seven",
   "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
   "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen");
   var word = map(number - 1);
   return word;
  }else if((number >= 20) && (number <= 99)){
   var map = Array("Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
   "Eighty", "Ninety");
   var word = map((number - 1) - 3);
   return word + " " + NumberToWords(number % 10, "");
  }else if((number >= 100) && (number <= 999)){
   return NumberToWords((number / 100).toInt, "") +
   " Hundred " + NumberToWords(number % 100, "");
  }else if((number >= 1000) && (number <= 9999)){
   return NumberToWords((number / 1000).toInt, "") +
   " Thousand " + NumberToWords(number % 1000, "");
  }else if((number >= 1000000) && (number <= 999999999)){
   return NumberToWords((number / 1000000).toInt, "") +
   " Million " + NumberToWords(number % 1000000, "");
  }

  return word;
 }
}
