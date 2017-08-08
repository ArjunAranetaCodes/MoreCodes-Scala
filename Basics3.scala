//Variables and Input

import java.util.Scanner;
object BasicInput {
 def main(args: Array[String]) {
  var name = "";
  var sex = "";
  var age = 0;

  var sc = new Scanner(System.in);
  print("What is your name? ");
  name = sc.nextLine();
  print("What is your sex? ");
  sex = sc.nextLine();
  print("What is your age? ");
  age = sc.nextInt();

  println();
  println("Name: " + name);
  println("Sex: " + sex);
  println("Age: " + age);
 }
}



