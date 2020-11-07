package com.example.apprendrekotlin

fun main() {
    println(fonctionOrdinaire(7));
    println(fonctionlamba(2));
}
//fonction ordinaire
fun fonctionOrdinaire(a:Int) = a*a;

//fonction lambda

val fonctionlamba: (Int) -> Int = {nbre ->
    nbre * nbre;
}