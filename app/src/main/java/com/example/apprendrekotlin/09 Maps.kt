package com.example.apprendrekotlin

// Une collection clé valeur

fun main() {
    val mapAgeImmutable = mapOf("mukaya" to 26, "gael" to 28);
    var mapAgeMutable = mutableMapOf("laurene" to 27, "axel" to 29);

    println(mapAgeImmutable);
    println(mapAgeMutable);

    //Afficher l'age de mukaya
    println(mapAgeImmutable["mukaya"])

    //Affichage du nombre des elements dans le map
    println(mapAgeImmutable.count());
    println(mapAgeImmutable.size);

    //Afficher les elements du map avec une condition
    println(mapAgeMutable.count {
        it.value == 27
    })

    //Pour ajouter un element dans le map

    mapAgeMutable["sarah"] = 34;
    println(mapAgeMutable);

    //Pour retirer un element dans le map
    mapAgeMutable.remove("axel");
    println(mapAgeMutable);

    //Pour verifier
    println(mapAgeMutable.containsKey("axel"));
    println(mapAgeMutable.containsValue(16));

    //pour filter un map avec la key et le value
    println(mapAgeMutable.filter {
        it.key == "laurene" || it.value == 20
    })

    //pour filter un map avec le value seulement
    println(mapAgeMutable.filter {
        it.value == 20
    })

    //Pour afficher seulement les values du map
    println(mapAgeMutable.values);

    //Pour afficher seulement les keys du map
    println(mapAgeMutable.keys);

}