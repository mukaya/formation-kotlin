package com.example.apprendrekotlin

fun main() {
    direBonjour();
    println(retourBonjour());
    println(salutation("Osée"));
    println(addition(4,7));
    println(multiplication(4, 4));
}

fun direBonjour(){
    println("Bonjour à tous");
}

fun retourBonjour(): String{
    return "Bonjour";
}

fun salutation(nom:String):String{
    return "Bonjour $nom";
}

fun addition(a:Int,b:Int): Int{
    return a.plus(b);
}

fun multiplication (x:Int, y:Int=2):Int{
    return x.times(y);
}