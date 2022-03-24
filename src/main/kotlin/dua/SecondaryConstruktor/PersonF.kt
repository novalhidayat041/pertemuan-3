package dua.SecondaryConstruktor
//l
class PersonF (val firstName: String, val lastName: String) {
    init {
        println("Sedang inisialisasi wak!")
    }
    constructor(_firstName: String, _lastName: String, _age:Int): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println()
    }
    constructor(_firstName: String, _lastName:String, _country:String): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Country : $_country")
        println()
    }
    constructor(_firstName: String, _lastName:String, _age:Int, _country:String): this(_firstName,
        _lastName, _age){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println("Country : $_country")
    }
}
fun main(){
    val maman = PersonF("Maman", "Sulaiman")
    val kemal = PersonF("Nurul", "Akmal", 21)
    val noval = PersonF("Noval", "Hidayat", "Indonesia")
    val Wawan = PersonF("Kurniawan", "Hamdi", 20, "Indonesia")
}