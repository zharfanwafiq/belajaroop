package belajarOop.classes

open class propertiesOverriding {
    open val umurPengguna :Int = 20
    fun cetakFirst(){
        println("Umur Saya $umurPengguna")
    }

}

open class Properties : propertiesOverriding(){
    override val umurPengguna :Int = 25
    open fun cetak(){
        println("Umur saya $umurPengguna ")
    }
    //trySUper
    val userAge :Int = super.umurPengguna
    fun cetakKedua(){
        println("Umur saya $userAge")
    }

}


fun main(){
    println(propertiesOverriding().cetakFirst())
    println(Properties().cetak())
    println(Properties().cetakKedua())
}