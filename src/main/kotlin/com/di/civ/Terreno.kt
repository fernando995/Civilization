package com.di.civ

data class Terreno(var nombre : String, val imagen  : String, val sePuedeAndarSobreEl : Boolean) {

    override fun toString(): String {
        return nombre
    }
    companion object {

        fun crearLlanura(): Terreno {
            return Terreno("Llanura", "src\\main\\resources\\images\\llanura.png", true)
        }

        fun crearColina(): Terreno {
            return Terreno("Colina", "src\\main\\resources\\images\\colina.png", true)
        }

        fun crearBosque(): Terreno {
            return Terreno("Bosque", "src\\main\\resources\\images\\bosque.png", true)
        }

        fun crearCiudad(): Terreno {
            return Terreno("Ciudad", "src\\main\\resources\\images\\pueblo.png", true)
        }

        fun crearMar(): Terreno {
            return Terreno("Mar", "src\\main\\resources\\images\\mar.png", false)
        }

        fun crearMontana(): Terreno {
            return Terreno("Montaña", "src\\main\\resources\\images\\montana.png", false)
        }

        fun crearTerrenoDesconocido(): Terreno {
            return Terreno("Terreno desconocido", "src\\main\\resources\\images\\desconocido.png", false)
        }
    }
}