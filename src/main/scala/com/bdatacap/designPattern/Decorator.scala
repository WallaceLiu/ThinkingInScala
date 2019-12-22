package com.bdatacap.designPattern

object Decorator {
  def add(a: Int, b: Int) = a + b

  def subtract(a: Int, b: Int) = a - b

  def multiply(a: Int, b: Int) = a * b

  def divide(a: Int, b: Int) = a / b

  def makeLogger(calcFn: (Int, Int) => Int) =
    (a: Int, b: Int) => {
      val result = calcFn(a, b)
      println("Result is: " + result)
      result
    }

  val loggingAdd = makeLogger(add)
  val loggingSubtract = makeLogger(subtract)
  val loggingMultiply = makeLogger(multiply)
  val loggingDivide = makeLogger(divide)

  def main(args: Array[String]): Unit = {
    loggingAdd(2, 3)
    loggingSubtract(2, 3)
    loggingMultiply(2, 3)
    loggingDivide(6, 3)
  }
}
