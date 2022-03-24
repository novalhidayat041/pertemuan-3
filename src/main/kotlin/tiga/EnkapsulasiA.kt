package tiga

class Employe(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field

    var name: String =_name
    set(value) {
        field = value
    }

    var age: Int =_age
    get() = field
    set(value) {
    }
}

fun main() {
    val emp = Employe(1101,"Noval", 20)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")
}