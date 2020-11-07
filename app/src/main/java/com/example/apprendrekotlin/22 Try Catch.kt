package com.example.apprendrekotlin

import java.lang.Exception
import java.lang.reflect.Executable

fun main() {
    //creation d'une exception
    val age = 15;
    try {
        getAge(age);
    }catch (e:Exception){
        println(e);
    }finally {
        println("Appelation de ma methode finaly");
    }

    println("le programme marche toujours");
}

fun getAge(age: Int){
    if(age < 18){
        throw ExceptionAge(age);
    }
}

//Exception personnalité
class ExceptionAge(val age:Int): Exception("$age nom valide");