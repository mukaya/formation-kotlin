package com.example.apprendrekotlin

 open class BaseAddition(val num1:Int,val num2:Int){
    open fun add() =  num1.plus(num2);
}

class Addition(val numero1:Int, val numero2:Int, val numero3:Int) : BaseAddition(numero1,numero2){
    //La possibilité de modifier la methode heritée

    override fun add(): Int {
        return numero1.plus(numero2).plus(numero3);
        //return super.add();
    }
}

fun main() {
    val addition = Addition(5,2,8);
    println(addition.add());

}