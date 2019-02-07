object HelloFor{
	def main(args:Array[String]){
		println("for 1<-1 to 5)")
		for(i <- 1 to 5) println(i)
		
		println("for i <- 1 to 5 by 2")
		for(i <- 1 to 5 by 2) println(i)
	//if 守卫式	
		println("for(i<- 1 to 10 if i%2==0)")
		for(i<- 1 to 10 if i%2==0)
		  println(i)
		println("双重循环")
		
		println("for(i<- 1 to 5;j<- 1 to 3)")
		for(i<- 1 to 5;j<- 1 to 3)
		  println(i*j)
		
		println("for(i<- 1 to 5 if i%2==0;j<-1 to 3 if i!=j)")
		for(i<- 1 to 5 if i%2==0;j<-1 to 3 if i!=j)
		  println(i*j)
	}
}
