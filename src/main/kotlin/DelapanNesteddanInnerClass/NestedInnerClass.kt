package DelapanNesteddanInnerClass

//Nested Class
//Ketika sebuah kelas dideklarasikan didalam kelas lain, maka ia disebut dengan nested class.
//Nested class di Kotlin sama dengan static nested class di Java.

class Outer {
    val a = "Outside Nested class."
    class Nested {
        val b = "Inside Nested class."
        fun callMe() = "Function call from inside Nested class."
    }
}
fun main(args: Array<String>) {
    // accessing member of Nested class
    println(Outer.Nested().b)
    // creating object of Nested class
    val nested = Outer.Nested()
    println(nested.callMe())
}