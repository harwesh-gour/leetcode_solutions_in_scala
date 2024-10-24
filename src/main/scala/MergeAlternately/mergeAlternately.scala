package MergeAlternately

import java.util.Scanner

object mergeAlternately extends App {

  private val scan: Scanner = new Scanner(System.in)

  println("Enter Strings")

  private val word1: String = scan.nextLine()

  private val word2: String = scan.nextLine()

  private val maxLength: Int = Math.max(word1.length, word2.length)

  private val merged: StringBuffer = new StringBuffer()

  for(i <- 0 to maxLength){
    if (i < word1.length) merged.append(word1(i))
    if (i < word2.length) merged.append(word2(i))
  }

  private val mergedString: String = merged.toString
  println(mergedString)
}