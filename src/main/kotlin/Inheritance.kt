//super class
open class Handphone {
    open fun merk() {

    }
}

//child class
class Samsung : Handphone() {
    override fun merk() {
        println("Handphone Samsung")
    }
}

class Iphone : Handphone() {
    override fun merk() {
        println("Handphone Iphone")
    }
}

fun main() {
    //object
    val samsung = Samsung()
    val iphone = Iphone()
    samsung.merk()
    iphone.merk()
}