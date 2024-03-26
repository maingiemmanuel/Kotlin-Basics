fun getGreetings():String{
    return "Hello Kotlin"
}

//function parameters
fun sayhello(itemTOGreet:String){
    val msg = "Hello" + itemTOGreet
    println(msg)
}



fun main(args: Array<String>) {
println("Hello World")
println(getGreetings())
println(sayhello(itemTOGreet = "Hello Collins"))

}