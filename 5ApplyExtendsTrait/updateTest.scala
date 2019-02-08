//调用了伴生对象的apply方法
val myStrArr = Array("BigData","Hadoop","Spark")
val myStrArr2 = new Array[String](3)
//调用了伴生类的update方法,执行myStrArr2.update(0,"apply")
myStrArr2(0) = "apply"

myStrArr2(1) = "update"
myStrArr2(2) = "all"
println(myStrArr)
println(myStrArr2)
