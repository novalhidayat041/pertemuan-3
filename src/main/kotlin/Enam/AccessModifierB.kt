package Enam
//Kelas Abstrak adalah kelas yang tidak bisa di Instansiasi menjadi sebuah objek, akan tetapi ia
//bisa diwariskan ke kelas yang lainnya. Sebuah kelas abstrak biasanya berisi anggota abstrak
//(abstract member) yang tidak memiliki implementasi dan harus di override didalam subclassnya. Anggota abstrak memiliki akses modifier open secara default, jadi kita tidak perlu
//menulisnya secara eksplisit ketika mau di override.

abstract class Vehicle(val name: String,
                       val color: String,
                       val weight: Double) { // Concrete (Non Abstract) Properties
    // Properti Abstrak (Harus diganti oleh Subclass)
    abstract var maxSpeed: Double
    // Metode Abstrak (Harus diimplementasikan oleh Subclass))
    abstract fun start()
    abstract fun stop()
    abstract fun sound()
    // Concrete (Non Abstract) Method
    fun displayDetails() {
        println("Name: $name, Color: $color, Weight: $weight, Max Speed: $maxSpeed")
    }
}

class Car(name: String,
          color: String,
          weight: Double,
          override var maxSpeed: Double): Vehicle(name, color, weight) {
    override fun start() {
        // Kode untuk memulai Mobil
        println("Car Started")
    }
    override fun stop() {
        // Kode untuk memulai Mobi
        println("Car Stopped")
    }
    override fun sound() {
        // Kode suara mobil
        println("Brum...brum...brumm!")
    }
}

class Motorcycle(name: String,
                 color: String,
                 weight: Double,
                 override var maxSpeed: Double): Vehicle(name, color, weight) {
    override fun start() {
        // Kode untuk Memulai Sepeda Motor
        println("Bike Started")
    }
    override fun stop() {
        // Kode untuk Menghentikan Sepeda Motor
        println("Bike Stopped")
    }
    override fun sound() {
        // Kode suara mobil
        println("Preng...preng...preng!")
    }
}

fun main() {
    val car = Car("Ferrari 812 Superfast", "red", 1525.0, 339.60)
    val motorCycle = Motorcycle("Ducati 1098s", "red", 173.0, 271.0)
    car.displayDetails()
    motorCycle.displayDetails()
    car.start()
    car.sound()
    car.stop()
    motorCycle.start()
    motorCycle.sound()
    motorCycle.stop()
}