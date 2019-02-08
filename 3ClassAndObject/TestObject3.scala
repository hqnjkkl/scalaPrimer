class Person{
     val id = Person.newPersonId() //调用伴身对象中的方法
	//private val id = 1
	private var name = ""
	def this(name:String){
		this()
		this.name = name
	}
	def info(){printf("The id of %s is %d.\n",name,id)}
}

object Person{
	private var lastId = 0 //一个人的身份编号
	 def newPersonId():Int={
		lastId+=1
		lastId
	}
	def main(args:Array[String]){
		val person1 = new Person("Ziyu")
		val person2 = new Person("Minxing")
		person1.info()
		person2.info()
	}
}
