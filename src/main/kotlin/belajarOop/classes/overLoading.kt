package belajarOop.classes

class overLoading {

    var pengguna = ""

    fun selamatPagi(namaDepan: String):Unit{
        println("Hallo $namaDepan ,i'm ${this.pengguna}")
    }

    fun selamatPagi(firstName: String,midlleName:String,lastName: String):Unit{
        println("Hallo $firstName $midlleName $lastName , i'm $pengguna")

    }


}
