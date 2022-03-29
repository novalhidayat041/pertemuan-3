package EmpatInheritance
//Overriding Property
//Sama halnya seperti fungsi, property di Kotlin pada kelas induk dapat di override dengan
//menggunakan akses modifier open.

import java.text.NumberFormat
import java.util.*

open class EmployeeD {
    // Gunakan pengubah "terbuka" untuk mengizinkan kelas anak menimpa properti ini
    open val  baseSalary: Int = 3000000
}

class Programmer : EmployeeD() {
    // Gunakan pengubah "override" untuk mengganti properti kelas dasar
    override val baseSalary: Int = 5000000
}

class SoftwareEngineer : EmployeeD() {
    //Gunakan pengubah "override" untuk mengganti properti kelas dasar
    override val baseSalary: Int = 6000000
}

class ProjectManager : EmployeeD() {
    // Gunakan pengubah "override" untuk mengganti properti kelas dasar
    override val baseSalary: Int = 8000000
}
fun toRupiahFormat(baseSalary: Int) : String{
    val localeID = Locale("in", "ID")
    val numberFormat = NumberFormat.getCurrencyInstance(localeID)
    return numberFormat.format(baseSalary).toString()
}

fun main() {
    val employeeD = EmployeeD()
    println("Rata-rata gaji ${employeeD.javaClass.simpleName} = ${toRupiahFormat(employeeD.baseSalary)}")

    val programmer = Programmer()
    println("Rata-rata gaji ${programmer.javaClass.simpleName} = ${toRupiahFormat(programmer.baseSalary)}")

    val softwareEngineer = SoftwareEngineer()
    println("Rata-rata gaji ${softwareEngineer.javaClass.simpleName} = ${toRupiahFormat(softwareEngineer.baseSalary)}")

    val projectManager = ProjectManager()
    println("Rata-rata gaji ${projectManager.javaClass.simpleName} = ${toRupiahFormat(projectManager.baseSalary)}")


}

