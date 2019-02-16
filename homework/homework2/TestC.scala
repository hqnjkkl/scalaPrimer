class C{
}
//trait的主构造器不能有参数列表，并且也没有辅助构造器
//这也要求父类有一个无参构造器
trait T extends C{def fly()}

class C1(val name:String) extends T{

	def fly(){println("I can fly.")}
}
val t = new C1("scala")
println(t.name)//期望输出scala
t.fly()  //期望输出I can fly
