// src/main/scala/progscala2/toolslibs/Complex.scala
package com.bdatacap.toolslibs

case class Complex(real: Double, imaginary: Double) {
  def +(that: Complex) =
    new Complex(real + that.real, imaginary + that.imaginary)
  def -(that: Complex) =
    new Complex(real - that.real, imaginary - that.imaginary)
}
