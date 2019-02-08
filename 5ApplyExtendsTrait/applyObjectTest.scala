object TestApplySingleObject{
	def apply(param1:String,param2:String):String={
		println("apply method called")
		param1 + " and " +param2
	}
}
val group = TestApplySingleObject("Zhangfei","Liubei")
println(group)
//只需要对象名，加参数，加括号，就可以调用方法
/*
 $ scala applyObjectTest.scala 
apply method called
Zhangfei and Liubei
 */
