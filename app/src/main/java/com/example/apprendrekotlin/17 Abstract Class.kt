package com.example.apprendrekotlin

//Se concentrer sur le nessaicere et non sur le detail

abstract class Ordinateur{
    abstract fun systemeDexploitation(): String;
}

class Asus: Ordinateur(){
    override fun systemeDexploitation(): String {
        return "Windows 10";
    }
}

class Ios: Ordinateur(){
    override fun systemeDexploitation(): String {
        return "Ios";
    }
}
fun main() {
    val asus = Asus();
    println(asus.systemeDexploitation());

    val ios = Ios();
    println(ios.systemeDexploitation());
}