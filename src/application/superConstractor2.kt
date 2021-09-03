package application

open class pelanggan (val nama : String, val jenis : String, val balance : Long){
    constructor(nama: String, jenis: String) : this (nama,jenis,2)
    constructor(nama: String):this (nama,"medium ")
}

class premiumPelanggan : pelanggan{
    constructor(nama: String) : super(nama,"High")
    constructor(nama: String,balance: Long) : super(nama,"low",balance)
}