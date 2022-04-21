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

    fun obtenerSubMapa(filaCentro: Int, columnaCentro: Int, vision: Int) : MutableList<MutableList<Terreno>>{

        val puntoMedio = vision / 2 + 1

        val subMapa = MutableList(Configuracion.columnasCampoVision) {
            MutableList(Configuracion.filasCampoVision) {
                Terreno.crearTerrenoDesconocido()
            }
        }
        //var filaActual = 0
        for ((columnaActual, columnaActualMapaGrande) in ((columnaCentro - puntoMedio)..(columnaCentro + puntoMedio)).withIndex()) {
            println("columnaActualMapaGrande = $columnaActualMapaGrande")
            println("ColumnaActual = $columnaActual")
            for ((filaActual, filaActualMapaGrande) in ((filaCentro - puntoMedio) .. (filaCentro + puntoMedio)).withIndex()) {
                println("filaActualMapaGrande = $filaActualMapaGrande")
                println("filaActual = $filaActual")
                if (!(columnaActualMapaGrande < 0 || filaActualMapaGrande < 0 || columnaActualMapaGrande >= Configuracion.columnasMapa || filaActualMapaGrande >= Configuracion.filasMapa)){
                    subMapa[columnaActual][filaActual] = matriz[columnaActualMapaGrande][filaActualMapaGrande]
                }
            }
        }
        println(matriz)
        println(subMapa)
        return subMapa
    }


}