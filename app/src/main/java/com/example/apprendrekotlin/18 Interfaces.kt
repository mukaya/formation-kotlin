package com.example.apprendrekotlin

interface Computer{
    fun systemeDexplotation(): String;
    fun dateDeCreation(): Int;
    fun CreE() = "ABC";
}
interface typeComputer{
    fun moduleComputer(): String;
}

class Hp: Computer, typeComputer{
    override fun systemeDexplotation(): String {
       return "Windows 10";
    }

    override fun dateDeCreation(): Int {
       return 2020;
    }

    override fun moduleComputer(): String {
        return "je suis modulz computer";
    }

}

fun main() {
    val hp = Hp();
    println(hp.systemeDexplotation());
    println(hp.dateDeCreation());
    println(hp.CreE());
    println(hp.moduleComputer());
}