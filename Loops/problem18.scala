
object Problem18 {
 def main(args: Array[String]) {
  var x = 0;
  for (x <- 0 to 11){
   println(Fibonacci(x));
  }
 }

 def Fibonacci(num:Int) : Int = {
  if ((num == 1) || (num == 0)){
   return num;
  }else{
   return Fibonacci(num - 1) + Fibonacci(num - 2);
  }
 }
}

