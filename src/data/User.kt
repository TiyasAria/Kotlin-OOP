package data

// membuat properties di constractor

class User (var username : String , var password : String ){
    // PENGGUNAAN THIS
     // lalu menggunakan kata this (untuk referensi object saat ini, hanya bisa di akses dlm class
    // tsb, untuk mengakses properties yang tertutup oleh parameter dengan nama yang sama)

    fun sayHello(username: String){
        println("hello $username ,perkenalkan nama saya $username ")
        // hasilnya "hello rangga, perkenalkan nama saya Rangga"
        /* padahal yang username kedua ingin mengambil yang di properties karena menggunakan nama
        yang sama , maka penggunaan THIS inilah digunakan gaees,*/
        println("hello $username, perkenalkan nama saya ${this.username}")
        // hasinya sesuai keingginan kita "hello Rangga, perkenalkan nama saya Tiyas aria"
    }
}