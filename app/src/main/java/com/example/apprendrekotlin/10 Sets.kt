package com.example.apprendrekotlin

fun main() {
    val noms = setOf("kalala","mukeba", "lubumbashi");
    var villes = mutableSetOf("Goma", "lubumbashi");

    println(noms);
    println(villes);

    villes.add("Kinshsa");
    println(villes);

    villes.remove("Goma");
    println(villes);

    var unionVillesEtNoms = noms union  villes;

    println(unionVillesEtNoms);

    var intersectionNomsEtVilles = noms intersect villes;
    println(intersectionNomsEtVilles);
}