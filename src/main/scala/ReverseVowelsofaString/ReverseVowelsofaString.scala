package ReverseVowelsofaString

object ReverseVowelsofaString extends App {

  def reverseVowels(s: String): String = {
    val vowels: String = "aeiouAEIOU"
    val reverseListofVowel: Array[Char] = s.filter(vowels.contains).reverse.toArray
    val result: Array[Char] = s.toCharArray
    var index: Int = 0
    for (i <- result.indices){
      if(vowels.contains(result(i))){
        result(i) = reverseListofVowel(index)
        index = index + 1
      }
    }
    result.mkString

  }

  val inputString: String = scala.io.StdIn.readLine()
  println(reverseVowels(inputString))





}
