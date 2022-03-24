package tiga
//Inisialisasi sintaks getter dan setter di Kotlin bersifat opsional, karena secara sefault Kotlin telah
//men-generate method getter dan setter untuk property yang mutable (var) dan hanya getter
//untuk property yang read-only (val). Secara default kode yang ter-generate secara otomatis
//tersebut adalah .seperti pada contoh berikut :
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