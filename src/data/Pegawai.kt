package data
//inheritance ialah pewarisan
// class parent
open class Pegawai (var name : String) {
    // menambah kata open fun agar bisa di muat ulang di class lain
   open fun sayHii(name: String){
        println("hiii $name, perkenalkan nama saya ${this.name}")
    }
}
/**
jadi inheritance adalah sebuah pewarisan dan ketika kita ingin mewariskan hanya boleh class anak
hanya boleh punya 1 class ortu, sedang class ortu boleh punya banyak class anak. dan dalam class
gak boleh ada 2 class jadi harus ada kata "OPEN" didepan class ortunya
 */

//class child
class Manager(name: String) : Pegawai(name)
/**
apa yang dimiliki oleh class parent maka akan dimiliki juga oleh class child, diatas class parentnya
punya func sayhii dan properties constructor, maka ini nanti juga memiliki itu.
lalu untuk yang (NAME : STRING) karena memubuat constructor nya maka child juga harus ada.
lalu yang name akhir itu maksudnya memanggil si constructor name manager
 */

// FUNC OVERRIDING
/**
- Kemampuan membuat ulang func yang sudah ada di class parent
- func di class itu adalah final , dan tidak bisa dimuat ulang di class lain jadi agar bisa
dimuat ulang menggunakan kata kunci OPEN
 */

open class vicePresident(name: String):Pegawai(name) {
    // untuk deklarasi harus menggunakan override , dan untuk nama func dan parameternya harus sama
    // yang bolehh beda hanya isi dari func nya
   final  override fun sayHii(name: String){
    println("hii, my name is $name, nama managerku adalah ${this.name}")
    }
    //kata final digunakan untuk memberhentikan pengulangan override fun agar tidak bisa diulang
    //class child berikutnya
}

//final func overriding
/**
saat kita membuat ulang func di class child, secara otomatis func tsb bersifat open yang artinya
bisa dibuat ulang di class child dibawahnya lagi
- untuk tidak diulang kembali dlam class childnya maka gunakan kata final
 */

class superManager (name: String) : vicePresident(name){
    //ketika kita mau mengulang fun maka secara otomatis akan ke open tidak perlu menambahkan kata
    //open karena berasal dari child
    // ketika ditambah fun maka akan error ini nanti.
   /* override fun sayHii(name: String){
        println("hii, my name is $name, nama super managerku adalah ${this.name}")
    } */

}