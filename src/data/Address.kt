package data

class Address (streetParam : String, cityParam : String, countryParam : String) {
    val street = streetParam
    val city = cityParam
    val country = countryParam

    init{
        println("Create home address")
    }

}