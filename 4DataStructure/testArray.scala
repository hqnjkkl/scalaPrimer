val intValueArr = new Array[Int](3)
//用圆括号赋值
println("赋值前:"+intValueArr)
intValueArr(0) = 12 
intValueArr(1) = 45
intValueArr(2) = 33
println("赋值后:"+intValueArr)
for (i <- 0 to 2)
		println(intValueArr(i))
val myStrArr = new Array[String](3)
myStrArr(0) = "BigData"
myStrArr(1) = "Hadoop"
myStrArr(2) = "Spark"
for (i<- 0 to 2)println(myStrArr(i))
val intValueArr2 = Array(12,45,66)
val strArr2 = Array("BigData2","Hadoop2","Spark2")
for(i<- 0 to 2){
	println(intValueArr2(i))
	println(strArr2(i))
}
val myMatrix = Array.ofDim[Int](3,4)
val myCube = Array.ofDim[Int](3,2,4)

println("myMatrix(2)(3):"+myMatrix(2)(3))
println("myCube(2)(1)(3):"+myCube(2)(1)(3))
