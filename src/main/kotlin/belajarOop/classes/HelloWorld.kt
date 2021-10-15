package belajarOop.classes

class HelloWorld(
    var firstNameParam : String,
    var midlleNameParam : String?,
    var lastNameParam: String
){
    init {
        println("Print init $firstNameParam")
    }
    constructor(firstNameParam: String, lastNameParam: String): this (firstNameParam,null,lastNameParam)

    constructor(firstNameParam: String): this (firstNameParam,"")


}