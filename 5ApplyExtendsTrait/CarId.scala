trait CarId{
	var id:Int
	def currentId():Int//定义了一个抽象方法
}

class BYDCarId extends CarId{
	override var id = 10000
		def currentId():Int={id+=1;id}
}

class BMWCarId extends CarId{
	override var id = 20000
	def currentId:Int={id+=1;id}
}

object MyCar{
	def main(args:Array[String]){
		val myCarId1 = new BYDCarId()
		val myCarId2 = new BMWCarId()
		printf("My first CarId is %d.\n",myCarId1.currentId())	
		printf("My second CarId is %d.\n",myCarId2.currentId())
	}
}
