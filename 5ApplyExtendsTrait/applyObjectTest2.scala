class TestApplyClassAndObject{
}

class ApplyTest{
	def apply()=println("apply method in class is called!")
	def greetingOfClass:Unit={
		println("Greeting method in class is called.")
	}
}

object ApplyTest{
	def apply()={
		println("apply method in object is called")
		new ApplyTest()
	}
}

object TestApplyClassAndObject{
	def main(args:Array[String]){
		val a = ApplyTest() //用伴生对象的apply()方法
		a.greetingOfClass
		a() //调用伴生类中的apply方法
		a.apply //带括号的无参数方法，可以不带括号调用
		a //这个就不行了
	}
}
/*
 $ scala applyObjectTest2.scala 
apply method in object is called
Greeting method in class is called.
apply method in class is called!

 */
