package data

/**
toString function => fun yg digunakan untuk memberi tahu representasi string dr object,saat
kita melakukan println sebenarnya fun toString akan dipanggil, standarnya func tsb akan
mengembalikan kode unik dari si object, kita bisa mengovveridenya jika kita ingin mengubah
representasi dari string pd object kita
 */

/**
equals function => dikotlin saat kita melakukan perbandingan object menggunakan tanda ==
atau != sebenarnya itu sedang menggunakan equals func milik class any , untuk mengubah
cara membandingkannya kita bisa mengoverride func equals milik any.
 */

/**
hashcode => representasi angka di kotlin, berguna saat ingin konversi object kita jadi angka
penggunaan hashcode yg banyak dilakukan distruktur data, misal memastikan tidak ada data duplicate
agar lebih mudah dicheck hashcodenya jika nilai hashcodenya sama maka dianggap objectnya sama
 */

class MahasiswiIDN (val nama: String , val asal : String){

    override fun toString(): String {
        return "mahasiswa dengan nama $nama dan dari asal $asal"
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is MahasiswiIDN -> other.nama == this.nama
            is MahasiswiIDN -> other.asal == this.asal
            else -> false

        }
    }

    override fun hashCode(): Int {
        return nama.hashCode()
        asal.hashCode()

    }
}
/**
ABSTRAC CLASS
disini ketika jadi abstract gak bisa dijadikan object , hanya bisa di inheritance
jadi ketika membuat object langsung diclass childnya tdk diclass parentnya

 */

abstract class lokasi(val nama: String) {
    //ketika kita buat dia abstract otomatis dia akan ke open untuk diinheritance
}
class provinsi (nama: String) : lokasi(nama){
}
class negara(nama: String) : lokasi(nama)

/*
PROPERTIES DAN FUN ABSTRAC
membuatnya wajib di class abstract dan wajib dibuat ulang di class child
 */
abstract class hewan{
    abstract  val name : String //ini tidak boleh diisi (diinisialisasi) karena akan diisi di class child
    abstract  fun berjalan() // tidak boleh diberi body
}
 class cat: hewan(){
     override val name: String = "Kucing MIMIN kuh "

     override fun berjalan() {
         println("$name sedang berlari")
     }
 }

