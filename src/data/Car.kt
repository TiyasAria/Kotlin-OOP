package data
//membuat contructor di class seperti membuat param di func
class Car ( paramBrand : String,
            paramYear : Int = 2020){
    //lalu untuk buat propertiesnya data nya diambil dari contructor yang kita buat
    var brand = paramBrand
    var year = paramYear

    //untuk membuat kode program diclass gak bisa sembarangan,
    // misal nih kita mau ngeprintln harus pakai init
    init {
        println("Car $paramBrand telah dibuat ")
        //ini hasilnya akan ketampil di constuctur.kt yg bentuk file
        // maka akan ketampil otomatis di atas setiap object
    }

}