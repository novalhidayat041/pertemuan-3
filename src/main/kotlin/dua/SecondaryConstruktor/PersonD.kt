package dua.SecondaryConstruktor

import dua.konstruktor.PersonA

class PersonD {
    var firstName: String
    var lastName: String
    var age: Int
    constructor(_firstName: String, _lastName: String, _age: Int){
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}

fun main() {
    val noval = PersonA("Noval", "Hidayat", 20)
    println("Name : ${noval.firstName} ${noval.lastName}")
    println("Age: ${noval.age}")
}