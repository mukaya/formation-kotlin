package com.example.apprendrekotlin

fun main() {
    //notions de pair
    val pair = Pair("mukaya",56);
    println(pair)
    println(pair.first)
    println(pair.second);

    val(nom,prenom) = Pair("tshimabga","osée");
    println(prenom);

    //notion de triple
    val triple = Triple("kalala","mukeba","tshimanga");
    println(triple.third);

    //convetion pair or triple to list
    val pairEnList = pair.toList();

    val tripleList = triple.toList();
}