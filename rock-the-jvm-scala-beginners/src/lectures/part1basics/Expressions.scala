package lectures.part1basics

/**
  * Created by david on 3/22/2019.
  */
object Expressions extends App{

  val x = 1 + 2 // Expression - evaluated to a value, have a type (int)
  println(x)

  println(2 + 3 * 4)
  // math operators + _ * / bitwise operators & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  //?? ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ...changing a variable is called a side effect
  println(aVariable)

  //Instructions (DO, like imperative language) vs Expression (VALUE, every bit of code will compute a value)
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION, not Construction
  println(aConditionedValue)
  println(if(aCondition) 5 else 3 )
  println(1 + 3)

  var i = 0
  while (i < 10){
    println(i)
    i += 1

    // NEVER WRITE THIS AGAIN. WILL ITERATE DIFFERENTLY, DON'T WRITE IMPERATIVE CODE.

    // EVERYTHING IN SCALA IS AN EXPRESSION!

    val aWeirdValue = (aVariable = 3) // Unit === void
    println(aWeirdValue)

    // side effects: println(), whiles, reassigning

    // Code blocks, value of the block is the value of it's last expression

    val aCodeBlock = {
      val y = 2
      val z = y + 1

      if (z > 2) "hello" else "goodbye"

    }

    // 1. difference between "hello world" vs println("hello world")? 1 is a value, one is an
    // expression that is a side effect, unit, has the side effect of printing the string to the console
    // 2. what's the value of

    val someValue = {
      2<3
      // returns Boolean true
    }

    val someOtherValue = {
      if(someValue) 239 else 986
      42
      // returns 42, if expression is irrelevant
    }


  }

}
