
import java.util.Random;
object Problem2 {
 def main(args: Array[String]) {
  var rand = new Random();
  var x = 0;
  for(x  <- 0 to 4){
   println(rand.nextInt(9));
  }
 }
}

