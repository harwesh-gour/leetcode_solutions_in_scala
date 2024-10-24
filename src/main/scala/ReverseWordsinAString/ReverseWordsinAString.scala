package ReverseWordsinAString

object ReverseWordsinAString extends App {

  def reverseWords(s: String): String = {
    val listOfReverseWords: List[String] = s.split(" ").map(_.trim).toList.reverse.filter(_!="")
    val outputString: String = listOfReverseWords.mkString(" ")
    outputString
  }

  val inputString: String = scala.io.StdIn.readLine()
  println(reverseWords(inputString))


}
