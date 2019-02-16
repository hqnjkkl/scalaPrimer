abstract class Car{//抽象类，不能直接实例化
	val carBrand:String//字段没有初始化值，就是一个抽象字段
	def info()//抽象方法，不需要使用abstract关键字
	def greeting(){println("Welcome to my car!")}
}

class BMWCar extends Car{
	override val carBrand = "BMW" //重写超类字段，需要加入override关键字，否则编译会报错
	def info(){printf("This is a %s Car. It is on sale\n",carBrand)}
	//重写超类的抽象方法，可以加override关键字，也可以不加
	override def greeting() {println("Welcome to my BMW Car!")}
	//重写超类的非抽象方法，一定要加override关键字
}

class BYDCar extends Car{
    override val carBrand = "BYD" //重写超类字段，需要加入override关键字，否则编译会报错
    def info(){printf("This is a %s Car. It is cheap\n",carBrand)}   
	//重写超类的抽象方法，可以加override关键字，也可以不加
      override def greeting() {println("Welcome to my BYD Car!")}
      //重写超类的非抽象方法，一定要加override关键字
  }

object MyCar{
	def main(args:Array[String]){
		val myCar1 = new BMWCar()
		val myCar2 = new BYDCar()
		myCar1.greeting()
		myCar1.info()
		myCar2.greeting()
		myCar2.info()
	}
}
