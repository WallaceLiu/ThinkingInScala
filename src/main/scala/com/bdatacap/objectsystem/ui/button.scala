// src/main/scala/progscala2/objectsystem/ui/Button.scala
package com.bdatacap.objectsystem.ui

import com.bdatacap.traits.ui2.Clickable

class Button(val label: String) extends Widget with Clickable {

  // Simple hack for demonstration purposes:
  def draw(): Unit = println(s"Drawing: $this")

  // From Clickable:
  protected def updateUI(): Unit = println(s"$this clicked; updating UI")

  override def toString() = s"(button: label=$label, ${super.toString()})"
}

