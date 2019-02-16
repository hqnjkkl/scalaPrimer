trait CarId{
	var id:Int
	def currentId():Int//定义了一个抽象方法
}
trait CarGreeting{
	def greeting(msg:String){println(msg)}
}

class BYDCarId extends CarId with CarGreeting{
//使用extends关键字混入第1个特质，后面可以用with混入更多特质	
	override var id = 10000
		def currentId():Int={id+=1;id}
}

class BMWCarId extends CarId with CarGreeting{
	override var id = 20000
	def currentId:Int={id+=1;id}
}

object MyCar{
	def main(args:Array[String]){
		val myCarId1 = new BYDCarId()
		val myCarId2 = new BMWCarId()
		myCarId1.greeting("Welcome my first car.");
		printf("My first CarId is %d.\n",myCarId1.currentId())	
		myCarId2.greeting("Welcome my second car.")
		printf("My second CarId is %d.\n",myCarId2.currentId())
	}
}
