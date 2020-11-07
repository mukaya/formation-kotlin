package com.example.apprendrekotlin

fun main() {
    val football = ActualiteFoot("neymar", "psg", "barca");
    val football2  = ActualiteFoot("chrisiano", "real de madrid", "juventus");
    println(football.encienneEquie);

    println(ActualiteFoot.addition(7,8));
}

class ActualiteFoot(val nom:String,val actuelEquipe:String, val encienneEquie:String){

    init {
        println("Chargement...");
    }
    val nomFootBall = nom;
    val equipeFootballeur = "Acienne equipe $encienneEquie ActuelEquie equipe $actuelEquipe";

    init {
        println("Bienvenu...");
    }

    companion object{
        fun addition(a:Int,b:Int): Int{
            return a.plus(b);
        }
    }
}