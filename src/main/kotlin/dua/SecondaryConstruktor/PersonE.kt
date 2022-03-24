package dua.SecondaryConstruktor

class PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 20
    constructor(_firstName: String, _lastName: String){
        firstName = _firstName
        lastName = _lastName
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        age = _age
    }
    fun cetakInfo(){
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }
}

fun main() {
    val noval = PersonE("Noval", "Hidayat")
    noval.cetakInfo()
    println()
    val dina = PersonE("Rahma", "Dina", 19)
    dina.cetakInfo()
}