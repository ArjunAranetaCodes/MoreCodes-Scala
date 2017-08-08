
object Problem10 {
 def main(args: Array[String]) {
   var num = 371;
   var sum = 0;
   var temp = 0;
   var rmdr = 0;

   temp = num;

   while (temp != 0){
    rmdr = temp % 10;
    sum = sum + (rmdr * rmdr * rmdr);
    temp = temp / 10;
   }

   if (num == sum){
    println("Armstrong number");
   }else {
    println("Not an Armstrong number");
   }
 }
}

