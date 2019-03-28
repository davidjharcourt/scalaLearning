package lectures.part1basics

/**
  * Created by david on 3/23/2019.
  */
object Functions extends App{

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION.

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  /*
    1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
    2. Factorial function 1* 2 *3 * ... * n
    3. A Fibonacci function
      f(1) = 1
      f(2) = 1
      f(n) = f(n-1) + f(n-2)
    4. Tests if a number is prime
   */

  def aGreetingFunction(aName: String, aAge: Int): String = {
    "Hi, my name is " + aName + " and I am " + aAge + " years old."
  }

  println(aGreetingFunction("David", 39))

  def aFactorialFunction(aNum: Int): Int = {
    if (aNum <= 1) 1
    else aNum * aFactorialFunction(aNum-1)
  }

  println(aFactorialFunction(5))

  def aFibonacciFunction(aNum: Int): Int = {
    if (aNum <= 2) 1
    else aFibonacciFunction(aNum-1) + aFibonacciFunction(aNum-2)
  }

  println(aFibonacciFunction(6))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)


  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))

}
