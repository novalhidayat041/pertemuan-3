package EmpatInheritance

//Overriding Function
//Kotlin membutuhkan eksplisit akses modifier untuk meng-override fungsi pada kelas induk yaitu
//akses modifier open.

open class Teacher {
    //gunakan pengubah "terbuka" untuk mengizinkan kelas anak menimpanya
    open fun teach() {
        println("Teaching...")
    }

    fun info(){
        println("I'am a Teacher.")
    }
}

class MathsTeacher : Teacher() {
    //Harus menggunakan pengubah "override" untuk mengganti fungsi kelas dasar
    override fun teach(){
        println("Teaching Maths...")
    }
}

fun main() {
    val teacher = Teacher()
    val mathsTeacher = MathsTeacher()
    mathsTeacher.info()
    teacher.teach()
    mathsTeacher.teach()
}