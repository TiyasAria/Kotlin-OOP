package data

//super constractor
open class Pelanggan (val nama : String, val jenis : String,  val keseimbangan : Long ){
    // secondary const memanggil primary constractor
 constructor (nama : String,jenis: String) : this (nama,jenis,0)
    // cons ini memanggil secondary constractor
    constructor(nama: String) : this (nama,"high")
}

class premiumPelanggan : Pelanggan {
    /**
    di premium pelanggan kita hapus () karena supaya kita gak wajib masukin primary constractor
    disini, klau kita buat primary cons nanti saat buat secondary nya kita juga harus akses
    si primarry

     */
 constructor(nama: String) : super(nama,"low")
    // ini secondary cons yang mengakses cons di class parent yng cons ke 2
    constructor(nama:String, keseimbangan: Long) : super (nama,"medium", keseimbangan)
    // ini secondary cons yang mengakses cons di class parent yng cons primary
}

//lalu kita akan mencoba yg menggunakan primary constractor

class excecutivePelanggan (nama : String , keseimbangan : Long ) : Pelanggan (nama, "excecutive", keseimbangan){
    // di cons pelanggan langsung memanggil cons nya si pelanggan
    constructor(nama: String) : this(nama,2)
    /**
    ini merupakan cara ke 2 dimana kita tidak perlu menggunakan kata "super" namun kita langsung
    bisa memanggilnya dengan memanggil di samping pelanggan.(langsung dipanggil). lalu disaat kita
    membuat secondary constractor kita hanya memanggil si primary tak perlu menggunakan kata super
    untuk akses si cons di class parent karena sebelumnya sudah dipanggil.
     */
}