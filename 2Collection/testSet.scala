object HelloSet{
	def main(args:Array[String]){	
		//默认是不可变集合
		var mySet = Set("Hadoop","Spark")
		mySet+="Scala"
		println("mySet:"+mySet);
		//使用可变集合
		var myMutableSet=scala.collection.mutable.Set("Database","BigData")
		myMutableSet+="Cloud Computing"
		println("myMutableSet:"+myMutableSet);

	
	}
}
