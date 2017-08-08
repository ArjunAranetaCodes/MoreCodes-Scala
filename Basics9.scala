//Basics of Functions

object Functions {
 def main(args: Array[String]) {
  function1();
  function2(5);
  println("It's true! 1+1 = " + function3());
  println("Hi " + function4("More","Codes"));
 }

 //function that has no return value and no passing argument/parameter
 def function1(): Unit = {
  println("Hello there!");
 }

 //function that has no return value but has passing argument/parameter
 def function2(num:Int) : Unit = {
  println("That number is " + num);
 }

 //function that has return value but has no passing argument/parameter
 def function3() : Int = {
  var sum = 1 + 1;
  return sum;
 }

 //function that has return value and has passing argument/parameter
 def function4(firstName :String, lastName :String) :String = {
  var fullName = firstName + " " + lastName;
  return fullName;
 }
}


