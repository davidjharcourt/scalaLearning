package lectures.part1basics

import scala.annotation.tailrec

/**
  * Created by david on 3/28/2019.
  */
object Recursion extends App{

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " +(n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)

      result
    }
  }

  println(factorial(10))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x-1, x * accumulator)// TAIL RECURSION = use recursive call as the LAST expression
    }

    factHelper(n, 1)
  }
  /*
  anotherFactorial(10) = factHelper(10,1)
  = factHelper(9, 10*1)
  = factHelper(8, 9 * 10 * 1)
  = ...
  = factHelper(2,3 * 4 * ... * 10 * 1)
  = factHelper(1, 1 * 2 * 3 * 4 * ... * 10)
  = 1 * 2 * 3 * 4 * ... * 10
   */
  println(anotherFactorial(5000))

  // WHEN YOU NEED LOOPS, USE TAIL RECURSION.

  /*
    1. Concatenate a string n times
    2. IsPrime function tail recursive
    3. Fibonacci function, tail recursive
   */

  // 1. Concatenate a string n times
  @tailrec
  def concatenateTailRec(aString: String, n: Int, accumulator: String): String = {
    if (n <=0) accumulator
    else concatenateTailRec(aString, n-1, aString + accumulator)
//    @tailrec
//    def repeatHelper(xString: String, x: Int, stringAccumulator: Int, accumulator: Int): Int = {
//      if (x == 1) stringAccumulator, accumulator
//      else repeatHelper(xString, x - 1, x * stringAccumulator, x * accumulator)
//    }
//    repeatHelper(aString, n, 1)
  }
    println(concatenateTailRec("hello", 100, ""))


  // 2. IsPrime function tail recursive
  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else  isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailrec(n / 2, true)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))

  // 3. Fibonacci function, tail recursive
  def aFibonacciFunction(n: Int): Int = {
    @tailrec
    def fiboTailrec(i: Int, last: Int, nextToLast: Int ): Int =
      if (i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboTailrec(2,1,1)
  }

  println(aFibonacciFunction(8))
}
