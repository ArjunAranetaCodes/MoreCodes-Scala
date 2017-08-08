
object Problem17 {
 def main(args: Array[String]) {
   var num1 = 1;
   var num2 = 1;

   println(num1);
   while (num2 < 100){
    println(num2);
    num2 = num2 + num1;
    num1 = num2 - num1;
   }
 }
}

