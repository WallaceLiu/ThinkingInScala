// src/main/scala/progscala2/objectsystem/ui/ObservableClicks.scala
package com.bdatacap.objectsystem.ui

import com.bdatacap.traits.ui2.Clickable
import com.bdatacap.traits.observer.Subject

trait ObservableClicks extends Clickable with Subject[Clickable] {
    abstract override def click(): Unit = {
        super.click()
        notifyObservers(this)
    }
}
