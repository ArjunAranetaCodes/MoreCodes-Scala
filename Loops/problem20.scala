
object Problem20 {
 def main(args: Array[String]) {
  println("Sum is " + GetSum(10, 0));
 }

 def GetSum(num:Int, sum:Int) : Int = {
  if (num == 0){
   return sum;
  }else{
   return GetSum((num - 1), (sum + num));
  }
 }
}

