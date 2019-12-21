// src/main/scala/progscala2/traits/ui/Button.scala
package com.bdatacap.traits.ui

class Button(val label: String) extends Widget {

  def click(): Unit = updateUI()

  def updateUI(): Unit = { /* logic to change GUI appearance */ }
}
