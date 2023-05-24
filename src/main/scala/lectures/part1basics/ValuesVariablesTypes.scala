package lectures.part1basics

object ValuesVariablesTypes extends App{

  val x: Int = 42 // TYPES ARE OPTIONAL, YOU CAN WRITE val x = 42
  println(x)
  // x = 2 - ERROR, VALS CAN'T BE REASSIGNED
  // VALS ARE IMMUTABLE
  // COMPILER CAN INFER TYPES

  val aString: String = "bla bla"
  val anotherString = "blah blah"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4444
  val aLong: Long = 444444444444L // PUT L AT THE END
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // VARIABLES ARE MUTABLE
  var aVariable: Int = 4
  aVariable = 5 //SIDE EFFECTS
}
