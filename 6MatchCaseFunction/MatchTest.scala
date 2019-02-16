var colorNum =1
var colorStr = colorNum match{
	case 1 => "red"
	case 2 => "green"
	case 3 => "yellow"
	case _ => "Not Allowed"
}
println(colorStr)

var colorNum2 =4
var colorStr2 = colorNum2 match{
	case 1 => "red"
	case 2 => "green"
	case 3 => "yellow"
	case unexpected => unexpected + "is Not Allowed"
}
println(colorStr2)
