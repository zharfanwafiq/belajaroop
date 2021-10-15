package belajarOop.kodekotlin.Overriding

import belajarOop.classes.functionOverriding
import belajarOop.classes.overriding


fun main(){
    val userName = functionOverriding("Zharfan")
    userName.sayHay("Budi")

    val user = overriding("Wafiq")
    user.sayHay("Zharfan")

}