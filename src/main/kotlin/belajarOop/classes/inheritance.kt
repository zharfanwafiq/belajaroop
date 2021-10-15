package belajarOop.classes

open class inheritance {
    open fun sayHello(name:String){
        println("Hallo $name")
    }

}

final class selamatPagi : inheritance(){

    override fun sayHello(name: String) {
        super.sayHello(name)
    }
    fun saySelamat(){
        println("hallo")
    }
}

fun main(){
    val pengguna = inheritance()
    pengguna.sayHello("Zharfan")

    val sayaSendiri =selamatPagi()
    sayaSendiri.sayHello("Wafiq")
    sayaSendiri.saySelamat()

    val nama = selamatPagi()
    nama.sayHello("Zharfam")


}