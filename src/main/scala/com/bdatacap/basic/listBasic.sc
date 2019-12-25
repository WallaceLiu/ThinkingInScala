import scala.collection.mutable

// 定义整型 List
val xList = List(1, 2, 3, 4)
xList.map(l => l + 1)

val a = List(1)
val b = 2 +: a :+ 3
val c = a ++ b
val d = List("d")
val e = c ++ d

val x = List(1)
val y = mutable.LinkedList(2)
var z = x ++: y

List(2, 3).::(1)
List(1, 2) ::: List(3, 4)

val aa = List(1, 2, 3, 4)
val bb = (0 /: aa) (_ + _)
val cc = (1 /: aa) ((x, y) => x + y)

val aaa = List(1, 2, 3, 4)
val bbb = (aaa :\ 0) (_ + _)
val ccc = (aaa :\ 1) ((x, y) => x + y)

val sb1 = new StringBuilder()
aaa.addString(sb1)
val sb2 = new StringBuilder()
aaa.addString(sb2, ",")
val sb3 = new StringBuilder()
aaa.addString(sb3, "List(", ", ", ")")


List('a', 'b', 'c').aggregate(0)({ (sum, ch) => sum + ch.toInt }, { (p1, p2) => p1 + p2 })


List('a', 'b', 'c').apply(1)
List('a', 'b', 'c')(1)