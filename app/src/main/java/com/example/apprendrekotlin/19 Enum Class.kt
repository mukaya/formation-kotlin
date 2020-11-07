package com.example.apprendrekotlin

//Enum class est une class qui va nous permettre de creer des types de données ou de session de sonnées

enum class SexeEtudiant(val sex:String){
    MASCULIN("masculin"),
    FEMININ("feminin");
}

class Etudiant(val nom:String, val sexe:SexeEtudiant){
    init {
        println("$nom  ${sexe.sex}");
    }

}

fun main() {
    val etudiant1 = Etudiant("gael", SexeEtudiant.MASCULIN);
    val etudiant2 = Etudiant("laurene", SexeEtudiant.FEMININ);

    println(etudiant1.nom)
    println(etudiant1.sexe);
}