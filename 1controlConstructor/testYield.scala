object HelloYield{
	def main(args:Array[String]){
	var r = for(i <- 1 to 5 if i%2==0)
		yield{println(i);i}
	println("r:"+r)
	}
}
