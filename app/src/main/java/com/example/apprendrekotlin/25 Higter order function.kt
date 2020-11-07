package com.example.apprendrekotlin

//Higher order c'est une fonction prends en patametre une foncton lambda et qui nous retourne une autre fonction

fun main() {
    val addition = faireAddition();
    println(addition(8,5));
}

fun faireAddition(): (Int,Int)->Int{
    return ::ajoutNombre
}
fun ajoutNombre(nbre1:Int,nbre2:Int) = nbre1.plus(nbre2);