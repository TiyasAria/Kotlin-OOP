package data

class IDNSchool (ownerParam : String, headmasterParam : String, teacherParam : String,
                    studentParam : String) {
    init {
        println("Owner IDN is $ownerParam")
        println("Headmaster IDN is $headmasterParam")
        println("English Teacher IDN is $teacherParam")
        println("Student of seven grade IDN is $studentParam")
    }
    val owner = ownerParam
    val headmaster = headmasterParam
    val teacher = teacherParam
    val student = studentParam

}