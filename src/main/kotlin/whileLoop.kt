fun main() {
    var angka = 5
    while (angka > 2) {
        println("Hellau")
        angka-- //setiap melakukan perulangan nilai dari angka(5) dikurangi 1 atau decrement
    }

    println("dahmi")

    val nama = arrayOf("Dwi", "Ophi", "Ramadhan", "Sumbul")
    var i = 0 //untuk memulai dari index 0
    while (i < nama.size) {
        println(nama[i])
        i++
    }
    println("Panjang array nama = ${nama.size}")
}