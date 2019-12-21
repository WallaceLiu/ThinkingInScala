// src/main/scala/progscala2/traits/ui2/Button.scala
package com.bdatacap.traits.ui2

import com.bdatacap.traits.ui.Widget

class Button(val label: String) extends Widget with Clickable {

  protected def updateUI(): Unit = { /* logic to change GUI appearance */ }
}
