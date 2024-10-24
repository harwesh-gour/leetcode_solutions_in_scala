package CanPlaceFlowers

object CanPlaceFlowers extends App {

  val flowerBed: Array[Int] = scala.io.StdIn.readLine().replace("[", "").replace("]", "").split(",").map(_.trim).map(_.toInt).toArray
  val flowersToPlant: Int = scala.io.StdIn.readInt()
  println(canPlaceFlowers(flowerBed, flowersToPlant))

  def canPlaceFlowers(flowerbed: Array[Int], n: Int): Boolean = {
    var count = 0
    if (flowerbed.length == 1){
      if (flowerbed(0) == 0) {
        count = count + 1
        flowerbed(0) = 1
      }
    }
    for (i <- 0 until flowerbed.length) {
      if (i == 0){
        if (flowerbed(i) == 0 && flowerbed (i+1) == 0){
          count = count + 1
          flowerbed(i) = 1
        }
      }
      else if (i == flowerbed.length - 1){
        if (flowerbed(i) == 0 && flowerbed(i - 1) == 0) {
          count = count + 1
          flowerbed(i) = 1
        }
      }
      else {
        if (flowerbed(i - 1) == 0 && flowerbed(i) == 0 && flowerbed(i + 1) == 0) {
          flowerbed(i) = 1
          count = count + 1
        }
      }

    }
    if (n <= count && count > 0 && n > 0) true
    else if (n == 0) true
    else false
  }
}
