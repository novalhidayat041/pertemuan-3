package satu

class Greeter {
    //membuat class greeter untuk menyimpan atribut
    var text: String = ""
    fun greet() {
        println("Hello Object world")
    }
    fun greet(name:String) {
        println("$text $name")
    }
    fun with_ret_val(name: String): String {
        return "$text $name"
    }
}