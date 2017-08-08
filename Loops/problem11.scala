
object Problem11 {
 def main(args: Array[String]) {
   var num = 3333;
   var sum = 0;
   var temp = 0;
   var rmdr = 0;

   temp = num;

   while (temp != 0){
    rmdr = temp % 10;
    sum = sum * 10 + rmdr;
    temp = temp / 10;
   }

   if (num == sum){
    println("Palindrome number");
   }else {
    println("Not an Palindrome number");
   }
 }
}

