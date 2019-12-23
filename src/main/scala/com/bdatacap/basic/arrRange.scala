package com.bdatacap.basic

import scala.Array._

object arrRange {
  def main(args: Array[String]) {
    var myList1 = range(10, 20, 2)
    var myList2 = range(10, 20)

    // 输出所有数组元素
    for (x <- myList1) {
      print(" " + x)
    }
    println()
    for (x <- myList2) {
      print(" " + x)
    }

  }
}
