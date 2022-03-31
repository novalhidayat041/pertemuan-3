package LimaPolymorphism
//Dynamic Polymorphism (Overriding Function)
//Contoh kode program fungsi overriding :

open class MyBase {
    //Harus menggunakan pengubah "terbuka" untuk mengizinkan kelas anak menimpanya
    open fun think () {
        println("Hey!! i am thinking")
    }
}

class MyDerived: MyBase(){//pewarisan terjadi menggunakan konstruktor default
    // Harus menggunakan pengubah "override" untuk mengganti fungsi kelas dasar
    override fun think() {
        println("I Am from Child")
    }
}

fun main() {
    val myBase = MyBase()
    myBase.think()
    var myDerived = MyDerived()
    myDerived.think()
}