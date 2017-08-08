//Loop Structures

object HelloWorld {
 def main(args: Array[String]) {
  println("For Loop");
  var x = 0;
  for( x <- 0 to 10){
   print(x);
  }

  println();
  println();
  println("While Loop");
  x = 0;
  while(x<=10){
   print(x);
   x+=1;
  }

  println();
  println();
  println("Do Loop");
  x = 0;
  do{
   print(x);
   x+=1;
  }while(x<=10);
 }
}



