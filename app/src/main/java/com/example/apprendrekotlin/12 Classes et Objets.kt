package com.example.apprendrekotlin

fun main() {
  val person = Person();
    person.personne("mukaya",26);
    println(person.nom);
    println(person.age);
}

class Person{
    var nom = "";
    var age = 0;

    fun personne(name:String, agE:Int){
        nom = name;
        age = agE;
    }
}