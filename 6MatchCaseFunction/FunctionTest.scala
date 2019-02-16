//函数普通定义
def counter(value: Int): Int = { value +1}
val num:Int = 5
//函数变量
val counter2:Int=>Int = {value => value+1}
counter2(10)
/*
scala> :load FunctionTest.scala
Loading FunctionTest.scala...
counter: (value: Int)Int
num: Int = 5
counter2: Int => Int = $$Lambda$1186/1462144963@4f4a0e4
res19: Int = 11
 */
