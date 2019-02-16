val books = Map("hadoop"->5,"spark"->10,"hbase"->7)
books.get("hadoop")
books.get("hive")
/*
 :load OptionTest.scala
Loading OptionTest.scala...
books: scala.collection.immutable.Map[String,Int] = Map(hadoop -> 5, spark -> 10, hbase -> 7)
res1: Option[Int] = Some(5)
res2: Option[Int] = None
 */
val sales = books.get("hive")
sales.getOrElse("No Such Book")
println(sales.getOrElse("No Such Book"))
/*
 sales: Option[Int] = None
res6: Any = No Such Book
No Such Book
 */
books.get("hive").foreach(println)
//什么都不打印
