// src/main/scala/progscala2/traits/ui2/Clickable.scala
package com.bdatacap.traits.ui2

// <1>

trait Clickable {
  def click(): Unit = updateUI() // <2>

  protected def updateUI(): Unit // <3>
}
