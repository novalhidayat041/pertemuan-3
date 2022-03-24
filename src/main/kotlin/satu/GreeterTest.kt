import satu.Greeter

fun main() {
    //memamannggil atribut yang ada didalam class
    val greeter = Greeter()
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Anton")
    greeter.greet("Budi")
    greeter.text = "Hello programer"
    println(greeter.with_ret_val("Dono"))
}