package dua.konstruktor

class PersonC (var firstname: String, var lastName: String, var age: Int) {}

fun main() {
    val budi = PersonA("Budi", "Gunawan", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age: ${budi.age}")
}