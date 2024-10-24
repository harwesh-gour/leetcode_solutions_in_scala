package KidsWithCandies
import java.util.Scanner
object KidsWithCandies extends App {

  def kidsWithCandies(candies: Array[Int], extraCandies: Int): List[Boolean] = {
    val maxNumberOfCandies: Int = candies.max
    val updatedCandies: Array[Int] = candies.map(i => i+extraCandies)
    val resultBoolean: List[Boolean] = updatedCandies.map(i => if(i > maxNumberOfCandies) true else false).toList
    resultBoolean
  }

  val scan: Scanner = new Scanner(System.in)
  val candies: Array[Int] = scan.nextLine().replace("[","").replace("]","").split(",").map(s => s.trim.toInt)
  val extraCandies: Int = scan.nextInt()

  println(kidsWithCandies(candies, extraCandies))


}
