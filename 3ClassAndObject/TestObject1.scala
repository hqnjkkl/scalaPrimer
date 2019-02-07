object Person{
	private var lastId = 0 //一个人的身份编号
	def newPersonId()={
		lastId+=1
		lastId
	}
}
printf("The first person id is %d.\n",Person.newPersonId())
printf("The first second id is %d.\n",Person.newPersonId())
printf("The third person id is %d.\n",Person.newPersonId())
