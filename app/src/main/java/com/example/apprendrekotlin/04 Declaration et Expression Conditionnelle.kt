package com.example.apprendrekotlin

fun main() {
    val age = 18;

    if(age <= 17){
        println("Avec $age Tu es mineur");
    }else{
        println("Avec $age Tu es mageur");
    }

    //Bonne pratique pour utiliser else et if en kotlin
    when(age){
        18 -> println("Tu es accepté");
        20 -> println("Tu es accepté");
        else -> println("Tu es refusé")
    }

    //Verification de la categorie d'age
    val checkAge = 45;

    when(checkAge){
        in 1..17 -> println("Vous etes mineur");
        in 18..50-> println("Vous etes déjà adulte");
        else -> println("Vous etes déjà à coté");
    }

    //Expression Condittionnelle

    val type:String;
    type = when(checkAge){
        in 1..17 -> ("Mineur");
        in 18..50-> ("Majeur");
        else -> ("Veuillard");
    }
    println(type);

}