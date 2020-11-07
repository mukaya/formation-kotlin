package com.example.apprendrekotlin

//Data class c'est une class utiliser pour contenir des données
fun main() {
    val utilisateur1 = Utilisateur("mukaya", 56, "Kinshasa");
    val utilisateur2 = Utilisateur("pamela", 6, "Goma");

    println(utilisateur1);
    println(utilisateur2);

    //Pour afficher seulement le nom d'utilisateur
    println(utilisateur1.nomUtilisateur);
    println(utilisateur1.component1());
    println(utilisateur1.component2());
    println(utilisateur1.component3());

    //Pour afficher une copie de l'utilisateur avec une certain modification de donné
    println(utilisateur1.copy(age=3));

    //Destructuration de données
    val(nomUtilisateur,age) = utilisateur1;
    println(nomUtilisateur);
}

data class Utilisateur(val nomUtilisateur: String, val age:Int, val ville:String);