
object Problem19 {
 def main(args: Array[String]) {
  PrintEven(10);
 }

 def PrintEven(num:Int) :Int = {
  if (num == 0){
   return num;
  }else{
   if (num % 2 == 0){
    println(num);
   }
   return PrintEven(num - 1);
  }
 }
}

