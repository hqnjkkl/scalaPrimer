class Counter{
	private	var privateValue = 0
	def value = privateValue
	def value_=(newValue:Int){
		if(newValue>0) privateValue = newValue
	}
	def increment(step:Int):Unit={value+=step}
	def current():Int={value}
}
object MyCounter{
	def main(args:Array[String]){
		val myCounter = new Counter
		println(myCounter.value)//不是用getter获取字段的值
		myCounter.value = 3 //不是使用set设置字段值
		println(myCounter.value)
		myCounter.increment(1)//设置步长为1，每次增加1
		println(myCounter.current)
	}
}
