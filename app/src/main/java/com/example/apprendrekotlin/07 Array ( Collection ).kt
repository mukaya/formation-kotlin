package com.example.apprendrekotlin

fun main() {
    val tableau = arrayOf(1,2,3,"Bonjour", "Tu es as", 0.8);
    println(tableau.contentToString());

    //Afficher un element specifique du tableau
    println(tableau[3]);

    //Affciher le premier element du tableau
    println(tableau.first());

    //Affciher le dennier element du tableau
    println(tableau.last());

    //Mises à jour des elements du tableau
    tableau[3] = 45;
    println(tableau.contentToString());

    //Afficher l'index donc la position d'un element du tableau
    val indexElement = tableau.indexOf(0.8);
    println(indexElement);

    //Afficher la somme des elements du tableau
    val tableauInt = intArrayOf(5,7,3,8,10,20);
    println(tableauInt.sum());

    //Afficher le nombre le plus grand du tableau
    println(tableauInt.max());

    //Afficher le nombre le plus petit du tableau
    println(tableauInt.min());

    //Affichage de compte des elements du tableau
    println(tableauInt.count());

    //Affichage d'un trie croissant des elements du tableau
    println(tableauInt.sortedArray().contentToString());

    //Affichage d'un trie decroissant des elements du tableau
    println(tableauInt.sortedArrayDescending().contentToString());

    //Affichage de nombre pairs
    val nbrpair = tableauInt.find {
        it % 2 == 0;
    }
    println(nbrpair);

}