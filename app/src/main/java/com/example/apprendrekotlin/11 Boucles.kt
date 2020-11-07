package com.example.apprendrekotlin

fun main() {
    val listes = listOf("mukaya","kadima","kabeya","kalonji");

    for(nom in listes){
        println(nom);
    }

    //Afficher les index et les noms de la liste
    for((index,value) in listes.withIndex()){
        println("index : $index nom: $value");
    }

    //Pour afficher seulement les indexs
    for(index in listes.indices){
        println(index);
    }

    //Pour afficher une liste des anties de 1 à 100
    for(i in 0..100){
        println(i);
    }

    //Pour afficher une liste des anties de 0 à 99
    for(i in 0 until 100){
        println(i);
    }

    //Pour afficher une liste des anties de 0 à 100 avec une incrementation de 5
    for(i in 0..100 step 5){
        println(i);
    }

    //Pour afficher une liste des anties de 100 à 0 avec une decrementation de 2
    for(i in 100 downTo 0 step 2){
        println(i);
    }

    //Parcourir une liste avec des conditions
    listes.forEach {
        if(it == "mukaya"){
            println(true);
        }
    }

    //Parcourir une liste avec des conditions et afficher aussi l'index
    listes.forEachIndexed {index,nom ->
        println("$index : $nom");
    }

    //boucle white
    var nombre = 0;
    while (nombre < 100){
        println(nombre)
        nombre ++
    }

    }