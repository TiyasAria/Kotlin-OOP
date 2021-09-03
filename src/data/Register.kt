package data

class Register ( usernameParam : String, emailParam : String , passwordParam :String,
                 kodeParam : String){

    init {
        println("ini constractor primer...")
    }

    // memuuat secondary konstraktor dengan mengambil beberapa item saja dari primary constractor
    constructor( usernameParam : String, emailParam : String) : this(usernameParam,emailParam,
            "","") {
        println(" ini secondary constractor ..")
    }

    // membuat properties
    val username = usernameParam
    val email = emailParam
    val password = passwordParam
    val kode = kodeParam

}