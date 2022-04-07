package com.di.civ

import kotlin.random.Random

class Mapa {

    var matriz = MutableList(Configuracion.columnasMapa) {
        MutableList(Configuracion.filasMapa) {

            when (Random.nextInt(0, 100)) {
                in 0..24 -> Terreno.crearLlanura()
                in 25..44 -> Terreno.crearColina()
                in 45..64 -> Terreno.crearBosque()
                in 65..69 -> Terreno.crearCiudad()
                in 70..89 -> Terreno.crearMar()
                in 90..99 -> Terreno.crearMontana()
                else -> Terreno.crearTerrenoDesconocido()
            }
        }
    }

    fun obtenerSubMapa(filaOrigen: Int, columnaOrigen: Int, rango: Int) : MutableList<MutableList<Terreno>>{
        val subMapa = MutableList((rango * 2) + 1) { columnaActual ->
            MutableList((rango * 2) + 1) { filaActual ->
                if (filaActual - filaOrigen - rango < 0 || columnaActual - columnaOrigen - rango < 0) {
                    Terreno.crearTerrenoDesconocido()
                }else {
                    matriz[columnaActual - columnaOrigen - rango][filaActual - filaOrigen - rango]
                }
            }
        }
        println(subMapa)
        return subMapa
    }


}