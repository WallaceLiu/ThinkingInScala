val greeting: String = "Hello,World!"

val buf = new StringBuilder;
buf += 'a'
buf ++= "bcdef"
println("buf is : " + buf.toString);

val len = buf.length


val str1 = "菜鸟教程官网："
val str2 = "www.runoob.com"
val str3 = "菜鸟教程的 Slogan 为："
val str4 = "学的不仅是技术，更是梦想！"
println(str1 + str2)
println(str3.concat(str4))



// string format
var floatVar = 12.456
var intVar = 2000
var stringVar = "菜鸟教程!"
var fs = printf("浮点型变量为 " +
  "%f, 整型变量为 %d, 字符串为 " +
  " %s", floatVar, intVar, stringVar)