//匿名函数,并且赋值
val myNumFunc: Int=>Int = (num:Int)=>num*2
println(myNumFunc(10))
//可以省略类型声明，让scala自动推断
val myNumFunc2 = (num:Int)=>num*3
println(myNumFunc2(10))
