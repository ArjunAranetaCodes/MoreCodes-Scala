//Problem 20: Write a program that converts a number to its 
//corresponding month (e.g. 1 = January).
object Problem20{
 def main(args:Array[String]){
  var index = 1;
  var month = Array("January", "February", "March", "April",
   "May", "June", "July", "August",
   "September", "October", "November", "December");

  println(month(index - 1));
 }
}
