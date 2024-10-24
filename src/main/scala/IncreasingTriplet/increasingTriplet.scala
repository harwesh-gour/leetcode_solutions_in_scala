package IncreasingTriplet

object increasingTriplet extends App {

  def increasingTriplet(nums: Array[Int]): Boolean = {
      for (i <- 1 until  nums.length-2) {
        if(nums(i-1) < nums(i) && nums(i) < nums(i+1) ){
          return true
        }
    }
    false
  }

  val num: Array[Int] = scala.io.StdIn.readLine().replace("[","").replace("]","").split(",").map(_.toInt).toArray
  println(increasingTriplet(num))

}
