for(elem <- List(9,12.3,"Spark","Hadoop","Hello")){
	val str = elem match{
		case i: Int => i+" is an int value"
		case d: Double => d+" is a double value"
		case "Spark" => "Spark is found."
		case s: String =>s +" is a string value."
		case _=> "This is a unexpected value."
	}
	println(str)
}
