// src/main/scala/progscala2/objectsystem/ui/Widget.scala
package com.bdatacap.objectsystem.ui

abstract class Widget {
  def draw(): Unit
  override def toString() = "(widget)"
}
