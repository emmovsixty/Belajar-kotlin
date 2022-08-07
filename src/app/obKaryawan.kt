package app

import data.Karyawan
import java.util.*

fun main() {
    println("--- Pengumpulan Data Karyawan ---")
    val input = Scanner(System.`in`)
    println("masukan nama")
    val nama = input.next()
    println("masukan alamat")
    val alamat = input.next()
    println("masukan umur")
    val umur = input.nextInt()
    println("Jumlah anak")
    val jmlAnak = input.nextInt()
    val gaji = 2_000_000
    var objek = Karyawan(nama,alamat,umur,gaji,jmlAnak)

    println("nama : ${objek.nama} \nalamat : ${objek.alamat} \numur : ${objek.age}")
    println("jumlah anak : ${objek.JmlAnak} \ngaji : ${objek.salary}")
}