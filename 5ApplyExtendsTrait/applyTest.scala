class TestApplyClass{
	def apply(param:String):String={
		println("apply method called,parameter is:" + param)
		"Hello World!"
	}
}
val myObject = new TestApplyClass
println(myObject("param1"))
/*
  scala applyTest.scala 
apply method called,parameter is:param1
Hello World!
 */
