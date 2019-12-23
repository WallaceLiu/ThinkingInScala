package com.bdatacap.basic

object collect {
  def main(args: Array[String]) {
    // 定义整型 List
    val xList = List(1, 2, 3, 4)

    // 定义 Set
    val xSet = Set(1, 3, 5, 7)

    // 定义 Map
    val xMap = Map("one" -> 1, "two" -> 2, "three" -> 3)

    // 创建两个不同类型元素的元组
    val xTuple = (10, "Runoob")

    // 定义 Option
    val xOption: Option[Int] = Some(5)

    val it = Iterator("Baidu", "Google", "Runoob", "Taobao")

    while (it.hasNext) {
      println(it.next())
    }


    val ita = Iterator(20, 40, 2, 50, 69, 90)
    val itb = Iterator(20, 40, 2, 50, 69, 90)

    println("最大元素是：" + ita.max)
    println("最小元素是：" + itb.min)
    println("ita.size 的值: " + ita.size)
    println("itb.length 的值: " + itb.length)
  }
}
