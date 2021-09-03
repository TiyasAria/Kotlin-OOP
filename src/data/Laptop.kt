package data

class Laptop(paramBrand :String, paramYear : Int, paramPrice: Int) {

    init {
        println("laptop dengan $paramBrand telah dibuat ")
    }

    //properties
    var brand = paramBrand
    var year = paramYear
    var price = paramPrice

    //secondary constractur
    constructor(paramBrand: String,paramYear: Int): this
    (paramBrand,2020,3_000_000) {
        println(" this is secondary constractur")
    }

}