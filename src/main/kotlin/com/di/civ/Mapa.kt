package com.di.civ

import kotlin.random.Random

class Mapa {

    private val vision = 1

    var matriz = MutableList(5) {
        MutableList(5) {
            var numeroRandom = Random.nextInt(0, 100)

            when {
                numeroRandom in 0..24 -> Terreno.crearLlanura()
                numeroRandom in 25..44 -> Terreno.crearColina()
                numeroRandom in 45..64-> Terreno.crearBosque()
                numeroRandom in 65..69 -> Terreno.crearCiudad()
                numeroRandom in 70..89 -> Terreno.crearMar()
                numeroRandom in 90..99 -> Terreno.crearMontana()
                else -> Terreno.crearTerrenoDesconocido()
            }
        }
    }

    fun obtenerSubmapa(filaOrigen: Int, columnaOrigen: Int, rango: Int) : MutableList<MutableList<Terreno>>{
        var mapaColindante = MutableList((rango * 2) + 1) { columnaActual ->
            MutableList((rango * 2) + 1) { filaActual ->
                if (filaActual - filaOrigen < 0 || columnaActual - columnaOrigen < 0) {
                    Terreno.crearTerrenoDesconocido()
                }else {
                    matriz[columnaActual - columnaOrigen][filaActual - filaOrigen]
                }
            }
        }
        println(mapaColindante)
        return mapaColindante
    }


}