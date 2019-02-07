class Counter{
	private var value = 0
	private var name =""
	private var mode = 1
	def this(name:String){
		this()
		this.name = name
	}
	def this(name:String,mode:Int){
		this(name)
		this.mode = mode
	}
	def increment(step:Int):Unit={value+=step}
	def current():Int={value}
	def info():Unit={printf("Name:%s and mode is %d\n",name,mode)} 
}
object MyCounter{
	def main(args:Array[String]){
		val myCounter1 = new Counter //主构造器
		val myCounter2 = new Counter("Runner")
		val myCounter3 = new Counter("Timer",2)//第二个辅助构造器
		myCounter1.info//显示计数器信息
		printf("Current Value is :%d\n",myCounter1.current)//显示计数器当前规模
		myCounter2.info//显示计数器信息
		myCounter2.increment(2)
		printf("Current Value is :%d\n",myCounter2.current)//显示计数器当前>    规模
		myCounter3.info //显示计数器信息
		myCounter3.increment(3) //设置步长
		printf("Current Value is :%d\n",myCounter3.current)//显示计数器当前>        规模
	}
}
