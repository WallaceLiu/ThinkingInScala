// src/main/scala/progscala2/objectsystem/ui/RadioButton.scala
package com.bdatacap.objectsystem.ui

import com.bdatacap.traits.ui._

/**
 * Button with two states, on or off, like an old-style,
 * channel-selection botton on a radio.
 */
class RadioButton(val on: Boolean, label: String) extends Button(label)

object RadioButton {
  def unapply(button: RadioButton) = Some((button.on, button.label))
                 // equivalent to: = Some(Tuple2(button.on, button.label))
}
