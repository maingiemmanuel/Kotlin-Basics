class staff(val name:String, val age:Int, val gender:String)

fun main(args: Array<String>) {
    val myobj = staff( "Denis", 28, "Male")
    println("Staff name is ${myobj.name}")
    println("Staff name is ${myobj.age}")
    println("Staff name is ${myobj.gender}")

    val myobj2 = staff( "Emmanuel", 20, "Male")
    println("Staff name is ${myobj2.name}")
    println("Staff name is ${myobj2.age}")
    println("Staff name is ${myobj2.gender}")

    val myobj3 = staff( "Joy", 24, "Female")
    println("Staff name is ${myobj3.name}")
    println("Staff name is ${myobj3.age}")
    println("Staff name is ${myobj3.gender}")

    val myobj4 = staff( "Lizzie", 19, "Female")
    println("Staff name is ${myobj4.name}")
    println("Staff name is ${myobj4.age}")
    println("Staff name is ${myobj4.gender}")

    val myobj5 = staff( "Ann", 23, "Female")
    println("Staff name is ${myobj5.name}")
    println("Staff name is ${myobj5.age}")
    println("Staff name is ${myobj5.gender}")
}