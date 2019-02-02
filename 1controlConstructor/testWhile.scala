object HelloWhile{
def main(args:Array[String]){
	var i = 9
	printf("before while i:%d\n",i)	
	while(i>0){
		i-=1
		printf("i is %d\n",i)
	}
	i=0
	printf("before do while i:%d\n",i)
	do{
		i+=1
		println(i)
	}while(i<5)
}
}
