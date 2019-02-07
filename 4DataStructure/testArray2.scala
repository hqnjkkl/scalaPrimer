import scala.collection.mutable.ArrayBuffer
val aMutableArr = ArrayBuffer(10,20,30)
//末尾加上40
aMutableArr+=40
println("aMutableArr:"+aMutableArr)
//第二个位置，加上60,40,索引从0开始
aMutableArr.insert(2,60,40)
println("aMutableArr:"+aMutableArr)
//删除第一个40
aMutableArr-=40
println("aMutableArr:"+aMutableArr)
var temp = aMutableArr.remove(2)
//删除第二个元素
println("temp:"+temp)
