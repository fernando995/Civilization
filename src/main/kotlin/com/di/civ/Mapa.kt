package com.di.civ

import kotlin.random.Random

class Mapa {

    init {


        var map = MutableList(100) {
            MutableList(100) {
                // var numeroRandom = (0..5).random()
                var numeroRandom = Random.nextInt(0, 5)
                when {
                    numeroRandom == 0 -> Terreno("Llanura", "llanura.jpg", true)
                    numeroRandom == 1 -> Terreno("Colina", "Colina.jpg", true)
                    numeroRandom == 2 -> Terreno("Bosque", "Bosque.jpg", true)
                    numeroRandom == 3 -> Terreno("Ciudad", "Ciudad.jpg", true)
                    numeroRandom == 4 -> Terreno("Mar", "Mar.jpg", false)
                    numeroRandom == 5 -> Terreno("Montaña", "Montaña.jpg", false)

                }
                var terreno = Terreno("Llanura", "llanura.jpg", true)
                terreno
            }
        }

        println(map)
    }
}