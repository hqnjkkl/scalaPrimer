val iter = Iterator("Hadoop","Spark","Scala")
while(iter.hasNext){
	println(iter.next())
}
val iter2 = Iterator("Hadoop","Spark","Scala")
for(elem <- iter2){
	println(elem)
}
val xs = List(1,2,3,4,5)
//grouped从第n个位置截断
val git = xs grouped 3
println("grouped"+git.next())
println("grouped"+git.next())
//sliding从分成每n个元素一个列表
val sit = xs sliding 3
println("sit"+sit.next())
println("sit"+sit.next())
println("sit"+sit.next())
