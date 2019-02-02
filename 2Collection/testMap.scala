object HelloMap{
	def main(args:Array[String]){	
		//默认是不可变映射
		val university=Map("XMU"->"Xiamen University",
					"THU"->"Tsinghua University","PKU"->"Peking University")
		println("university:"+university)
		println(university("XMU"))
		val xmu=if (university.contains("XMU")) university("XMU") else 0
		println(xmu)
		val university2 = scala.collection.mutable.Map("XMU"->"Xiamen University","THU"->"Tsinghua University","PKU"->"Peking University")
		println(university2)
		university2("XMU")="Ximan University"//更新已有元素的值
		university2("FZU")="Fuzhou University"//添加新元素
		println("university2:"+university2)
		university2+=("TJU"->"Tianjin University")//添加新元素
		university2+=("SDU"->"Shangdong University")//同时添加两个新元素
		println("university2:"+university2)

		val university3 = Map("XMU"->"Xiamen University",
                       "THU"->"Tsinghua University","PKU"->"Peking University")
         println(university3)
	//  university3("XMU")="Ximan University"//没办法再跟新了
      //    university3("FZU")="Fuzhou University"//
          println("university3:"+university3)
         // university3:=("TJU"->"Tianjin University")//没办法添加
          //university3:=("SDU"->"Shangdong University")//没办法添加
          println("university3:"+university3)
		  for((k,v) <- university3)
			printf("Code is :%s and name is:%s\n",k,v)
		  
		  println("keys")
		  for(k<-university.keys)println(k)
		println("values")  
		for(v<-university.values)println(v)
	}
}
