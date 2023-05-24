package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (RIGHT SHIFT WITH ZERO EXTENSION)

  println(1 == x) // TESTS FOR EQUALITY
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // ALSO WORKS WITH -= *= /=    SIDE EFFECTS
  println(aVariable)

  // INSTRUCTIONS (YOU TELL THE COMPUTER TO DO SMTH) VS EXPRESSIONS (VALUE)

  // IF EXPRESSION
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE LIKE THIS AGAIN!

  // EVERYTHING IN SCALA IS AN EXPRESSION!

  val aWeirdValue = (aVariable = 3) // UNIT == VOID
  println(aWeirdValue)

  // SIDE EFFECTS IN SCALA = EXPRESSIONS RETURNING UNIT

  // SIDE EFFECTS: println(), whiles, reassigning

  // CODE BLOCKS

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "HELLO" else "GOODBYE"
  }

  // 1. WHAT IS THE DIFFERENCE BETWEEN "HELLO WORLD" VS PRINTLN("HELLO WORLD")?
  // 2. WHAT IS THE VALUE OF NEXT TWO THINGS

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)
}