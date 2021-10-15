package belajarOop.classes

open class functionOverriding(val name: String) {
    open fun sayHay(name:String){
        println("Hai $name,Aku ${this.name}")
    }
}

final class overriding(name: String) : functionOverriding(name) {
    override fun sayHay(name: String) {
        super.sayHay(name)
        println("Halo $name ,Saya ${this.name}")
    }
}