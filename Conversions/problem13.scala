//Problem 13: Write a program that converts celsius to farenheit.
object Problem13{
 def main(args:Array[String]){
  var celsius = 10.0;
  var farenheit = 0.0;
  farenheit = (9.0 / 5.0) * celsius + 32.0;
  println(String.valueOf(celsius) + "C equals to " +
   String.valueOf(farenheit) + "F");
 }
}
