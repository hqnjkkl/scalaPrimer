val iter = Iterator("Hadoop","Spark","Scala")
while(iter.hasNext){
	println(iter.next())
}
val iter2 = Iterator("Hadoop","Spark","Scala")
for(elem <- iter2){
	println(elem)
}
