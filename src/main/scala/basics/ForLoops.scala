package basics

object ForLoops extends App {

  // Basic for Loop
  private val numbers: List[Int] = List(1,2,3,4,5)
  for(num <- numbers){
    println(num)
  }

  println("--------")
  private val matrix: Array[Array[Int]] = Array(Array(1, 2), Array(3, 4))
  for (row: Array[Int] <- matrix; col: Int <- row) {
    println(col)
  }
  /*
  Equivalent C Code for reference
  #include <stdio.h>

int main() {
    int matrix[2][2] = {
        {1, 2},
        {3, 4}
    };

    for (int i = 0; i < 2; i++) {       // Outer loop for rows
        for (int j = 0; j < 2; j++) {   // Inner loop for columns
            printf("%d\n", matrix[i][j]); // Print each element
        }
    }

    return 0;
}

   */
  println("----------------")
  val string: String = "Harwesh"
  for(char <- string)
    println(char)
  //by indices

  for(i: Int <- string.indices)
    println(s"$i - ${string(i)}")



}
