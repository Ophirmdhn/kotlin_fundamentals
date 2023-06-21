fun main() {

    val nama = arrayOf("Dwi", "Ophi", "Ramadhan")
    println(nama[1])

    val angka = IntArray(5)
    println(angka.size)

    println()
    val nomor = arrayOf(3,5,7,2,0,12,56,23,8)
    var max = nomor[0]
    for (i in nomor){
        if (i > max) {
            max = i
        }
    }
    for (i in nomor) {
        println(i)
    }
    println("Nilai Tertinggi = $max")
}
