object HelloList{
	def main(args:Array[String]){
		//默认是不可变List
		var strList=List("BigData","Hadoop","Spark")
		println("strList"+strList)
		//:: is connect symbol
		var otherList="Apache"::strList
		println("otherList:"+otherList);
		
		val intList1=1::2::3::Nil
		val intList2=List(1,2,3)
		println("intList1:"+intList1)
		println("intList2:"+intList2)
	}
}
