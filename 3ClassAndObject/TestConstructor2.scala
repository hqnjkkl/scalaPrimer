class Counter(val name:String,val mode:Int){
	private var value =0
	def increment(step:Int):Unit={value+=step}
	def current():Int={value}
	def info():Unit={printf("Name:%s and mode is %d\n",name,mode)}
}

object MyCounter{
	def main(args:Array[String]){
		val myCounter = new Counter("Timer",2)
		myCounter.info //显示信息
		printf("Current Value is :%d\n",myCounter.current)//显示计数器当前>        规模
	}
}
