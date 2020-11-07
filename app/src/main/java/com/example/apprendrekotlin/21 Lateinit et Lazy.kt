package com.example.apprendrekotlin

//lateinit permet de creer une variable qui sera initialisé après

class Voiture(){
    lateinit var nomVoiture: String;

    fun setValue(nomVoit:String){
        nomVoiture = nomVoit;
    }
    fun getValue() = if(::nomVoiture.isInitialized) nomVoiture else "pas encore initialiser"
}

fun main() {
    val voiture = Voiture();
    voiture.setValue("Tesla");
    println(voiture.getValue());

    //IL y a une allocation de memoire qui se crée à chaque instance
    val utilisateur = DetailUtil("axel",78);
    println(utilisateur.toString());

    //il y a une allocation de memoire que lorsque on fait une affectation
    //val utilByLazy : DetailUtil by Lazy { DetailUtil("tshibola",567)}
    //println(utilByLazy.toString());
}

//Notion de Lazy

class DetailUtil(val nom:String, val age:Int){
    init {
        println("Le nom est $nom");
        println("l'age est $age");
    }
}