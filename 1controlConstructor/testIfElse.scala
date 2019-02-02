object HelloIfElse{
def main(args:Array[String]){
	println("Please input a number:")
	val x = readInt()
	if(x>0){
		println("This is a positive number")
	}else if(x==0){
		println("This is not a zero")
	}else{
		println("This is a negative number")
	}
}
}
