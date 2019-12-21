// src/main/scala/progscala2/traits/ui2/ObservableClicks.scala
package com.bdatacap.traits.ui2

import com.bdatacap.traits.observer._

trait ObservableClicks extends Clickable with Subject[Clickable] {
  abstract override def click(): Unit = {        // <1>
    super.click()
    notifyObservers(this)
  }
}
