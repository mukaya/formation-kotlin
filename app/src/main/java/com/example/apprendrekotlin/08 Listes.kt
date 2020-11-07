package com.example.apprendrekotlin

fun main() {
    val listImmutable = arrayListOf(1,6,8,6,4);
    var listMutable = mutableListOf(1,2,3,6,8,9);

    println(listImmutable);
    println(listMutable);

    listMutable = mutableListOf(6,8,4,3,8,4,3,1);
    println(listMutable);

    // Ajouter un element dans le tableau
    listMutable.add(100);
    listMutable[0] = 1677777;
    println(listMutable);

    //Retirer ou supprimer un element dans la liste

    listMutable.remove(100);
    println(listMutable);

    //Verification d'un element dans la liste

    println(listMutable.contains(100));
    println(listMutable.contains(8));

    //utilisation de la fontion map

    val nbrCarreDeLaListe = listMutable.map {
        it * it
    }
    println(nbrCarreDeLaListe);

    //Utiliser la fontion slice ou subList pour trancher les elements de la liste

    val sliceList = listMutable.slice(0..3);
    val subList = listMutable.subList(0,5);

    println(sliceList);
    println(subList);

    //Utiliser la fonction take

    val troisPremier = listMutable.take(3);
    val troisDernier = listMutable.takeLast(3);

    println(troisPremier);
    println(troisDernier);

    //verifier si la liste est vide
    println(listMutable.isEmpty());

    //Affichage croissant de la liste
    println(listMutable.sorted())

    //Affichage decroissant de la liste
    println(listMutable.sortedDescending());

}