def echo(args: String*) =
  for (arg <- args) println(arg)
//
//def echo2(args: String*) =
//  echo3(args: _*)
//
//def echo3(args: String*) =
//  for (arg <- args) println(arg)

echo("hello")

echo("hello", "world!")

//echo2("hello")

//echo2("hello", "world!")

def sum(args: Int*) = {
  var result = 0
  for (arg <- args) result += arg
  result
}

val s1 = sum(1, 2, 3, 4, 5)
val s2 = sum(1 to 5: _*) // 1 to 5 is Range(1, 2, 3, 4, 5)


val arr = Array(1, 2, 3, 4, 5)
val Array(first, second, _*) = arr