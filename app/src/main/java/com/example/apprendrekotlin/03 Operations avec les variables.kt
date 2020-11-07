package com.example.apprendrekotlin

fun main() {

    val nbreEntier = 50;
    val nbrDecimal = nbreEntier.toDouble();

    println(nbreEntier);
    println(nbrDecimal);

    //Addition
    val a = 6;
    val b = 5;
    val results = a.plus(b);
    println(results);
    //Concatenation au template
    val nom = "Mukaya";
    val prenom = "Osée";

    println("$nom $prenom");

    //Afficher le nombre de caractère d'une chaine
    println(prenom.length);

    //Affciher juste le premier caractère
    println(prenom[0]);

    //Afficher une chaine en majuscule
    println(prenom.toUpperCase())

    //Afficher une chaine en minuscule
    println(prenom.toLowerCase());

    //Afficher une phrase sur plusieurs lignes
    val phrase = """Je suis une phrase qui
                    sera afficher en plusieur ligne
                    pour le bien de tous
    """.trimIndent();

    println(phrase);
}