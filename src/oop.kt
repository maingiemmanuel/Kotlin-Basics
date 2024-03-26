class safaristu{
//    data member
    var number:Int = 9
    var number1:Int = 15

//    member function
    fun square():Int{
    return number * number
    }
    fun sum():Int{
        return number1 + number1
    }
}

fun main(args: Array<String>) {
//    instance of an object
    val myobj = safaristu()
    println("The square is ${myobj.square()}")
    println("The sum is ${myobj.sum()}")

}
