import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
object HelloException{
def main(args:Array[String]){
try{
	val file = new FileReader("input.txt")

} catch{

	case ex:FileNotFoundException =>
			//文件不存在时的操作
	case ex:IOException =>
		//发生I/O错误时的操作
}finally{
	println("closed")
//确保关闭文件
}
}
}
