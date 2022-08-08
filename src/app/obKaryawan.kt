package app

import data.Anak
import data.Atasan
import data.Bawahan
import data.Karyawan
import java.util.*

fun main() {
    var nama = Karyawan()
    println(nama.nama)
    var nama1 = Bawahan()
    println(nama1.nama)
    var nama2 = Atasan()
    println(nama2.nama)
    var nama3 = Anak()
    println(nama3.nama)
}