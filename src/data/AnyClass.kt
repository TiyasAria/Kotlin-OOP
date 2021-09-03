package data

class laptop(val brand : String) // dia itu sifatnya any
open class  HandPhone (val brand: String)
class smartphone (brand: String, val os : String) : HandPhone(brand)