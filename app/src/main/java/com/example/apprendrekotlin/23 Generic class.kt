package com.example.apprendrekotlin


fun main() {
    Evennement("kalala");
    Evennement(55);
    Evennement(true);
    Event<String,Int>();
}
class Evennement <T>(value: T){
    init {
        println(value.toString().length);
    }
}

class Event <T,V>(value: T?=null, data:V?=null){
    init {
        if(value != null) println(value.toString().length) else println("pas de donnée");
    }
}