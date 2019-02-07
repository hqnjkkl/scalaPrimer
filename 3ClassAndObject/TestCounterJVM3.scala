class Counter{
	private	var value = 0
	def increment(step:Int):Unit={value+=step}
	def current():Int={value}
}
object MyCounter{
	def main(args:Array[String]){
		val myCounter = new Counter
	//	scala TestCounterJVM3.scala 
///Users/huqiaonan/language_study/scalaPrimer/3ClassAndObject/TestCounterJVM3.scala:9:
//error: variable value in class Counter cannot be accessed in Counter
		println(myCounter.value)//不是用getter获取字段的值
		println(myCounter.value)//不是用getter获取字段的值
		myCounter.value = 3 //不是使用set设置字段值
		myCounter.increment(1)//设置步长为1，每次增加1
		println(myCounter.current)
	}
}
