package GreatestCommonDivisorOfStrings

import java.util.Scanner

object GreatestCommonDivisorOfStrings extends App {

  val scan: Scanner = new Scanner(System.in)

  private def gcd(a: Int, b: Int): Int = {
    @annotation.tailrec
    def gcdHelper(a: Int, b: Int): Int = {
      if (b == 0) a
      else gcdHelper(b, a % b)
    }

    gcdHelper(a, b)
  }
  
  private val str1: String = scan.next()
  private val str2: String = scan.next()

  private val gcdLength: Int = gcd(str1.length, str2.length)

  private val candidateSubString: String = str1.substring(0,gcdLength)

  if (str1 == candidateSubString * (str1.length/gcdLength) && str2 == candidateSubString * (str2.length/gcdLength))
    println(candidateSubString)
  else println("No Greatest CommonDivisor Of Strings")


}
