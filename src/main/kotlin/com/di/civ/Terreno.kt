package com.di.civ

data class Terreno(var nombre : String, val imagen  : String, val sePuedeAndarSobreEl : Boolean) {

    override fun toString(): String {
        return nombre
    }
    companion object {

        fun crearLlanura(): Terreno {
            return Terreno("Llanura", "llanura.jpg", true)
        }

        fun crearColina(): Terreno {
            return Terreno("Colina", "Colina.jpg", true)
        }

        fun crearBosque(): Terreno {
            return Terreno("Bosque", "Bosque.jpg", true)
        }

        fun crearCiudad(): Terreno {
            return Terreno("Ciudad", "Ciudad.jpg", true)
        }

        fun crearMar(): Terreno {
            return Terreno("Mar", "Mar.jpg", false)
        }

        fun crearMontana(): Terreno {
            return Terreno("Montaña", "Montaña.jpg", false)
        }

        fun crearTerrenoDesconocido(): Terreno {
            return Terreno("Terreno desconocido", "llanura.jpg", false)
        }
    }
}