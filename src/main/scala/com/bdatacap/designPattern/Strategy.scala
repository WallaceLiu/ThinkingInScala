package com.bdatacap.designPattern

object Strategy {
  // arithmetic mean
  def arithmeticMean(scores: Array[Double]): Double = {
    var sum: Double = 0
    scores.foreach(s => sum = sum + s)
    sum / scores.length
  }

  // geometric mean
  def geometricMean(scores: Array[Double]): Double = {
    var multi: Double = 1
    scores.foreach(s => multi = multi * s)
    Math.pow(multi, 1.0 / scores.length)
  }

  //
  def setStrategy(mean: (Array[Double]) => Double) = {
    (scores: Array[Double]) => {
      mean(scores) // return is function
    }
  }

  def main(args: Array[String]): Unit = {
    val a = Array(9.12, 9.25, 8.87, 9.99, 6.99, 7.88)
    val b = Array(9.15, 9.26, 8.97, 9.89, 6.97, 7.89)

    //val compute = setStrategy(strategyOne)
    val compute = setStrategy(geometricMean)
    println(compute(a))
    println(compute(b))
  }

}
