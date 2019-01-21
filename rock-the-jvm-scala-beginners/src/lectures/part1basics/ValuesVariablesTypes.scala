package lectures.part1basics

/**
  * Created by david on 9/1/2018.
  */
object ValuesVariablesTypes extends App{

  val x: Int = 42
  println(x)


  // VALS ARE IMMUTABLE
  // Types of values are optional, the compiler can infer them

  val aString: String = "Hello, bozo"
  val anotherString = "goodbye"

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 3435344L
  val aFloat: Float =2.0f
  val aDouble: Double = 3.14

  //variables
  var aVariable: Int = 4
  aVariable = 5 // side effects






}
