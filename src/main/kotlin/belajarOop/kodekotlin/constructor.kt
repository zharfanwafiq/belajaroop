package belajarOop.kodekotlin

import belajarOop.classes.HelloWorld

fun main(){
    val zharfan = HelloWorld("Zharfan","wafiq")
    val joko = HelloWorld("zharfan")
    val budi =HelloWorld("zharfan","wafiq","ganteng")

    println(zharfan.lastNameParam)
    println(joko.firstNameParam)
    println(budi.midlleNameParam)

}