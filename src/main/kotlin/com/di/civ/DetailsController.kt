package com.di.civ

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.input.MouseEvent
import javafx.scene.layout.AnchorPane
import java.io.File

class DetailsController {

    var mapaController = MapController()
    var terreno : Terreno? = null

    @FXML
    private lateinit var nombre: Label
    @FXML
    private lateinit var imagen: ImageView
    @FXML
    private lateinit var andar: Label
    @FXML
    private lateinit var fondo: AnchorPane
    @FXML
    private lateinit var botoncoronado: Button
    @FXML
    private lateinit var botonsaqueo: Button
    @FXML
    private lateinit var botonmina: Button
    @FXML
    private lateinit var botongranja: Button
    @FXML
    private lateinit var fotogranja: ImageView
    @FXML
    private lateinit var fotocoronado: ImageView
    @FXML
    private lateinit var fotosaqueado: ImageView
    @FXML
    private lateinit var fotomina: ImageView
    @FXML
    private lateinit var estado: Label

    fun enviarTerreno(terreno: Terreno) {

        this.terreno = terreno

        nombre.text = "El terreno seleccionado es: "+ terreno.nombre
        andar.text = terreno.sePuedeAndarSobreEl.toString()
        fondo.style = terreno.colorTerreno
        estado.text = "El estado del lugar es "+ terreno.estado

        val f = File(terreno.imagen)
        imagen.image = Image(f.toURI().toURL().toString())

        comprobacionDeEstado()

    }

    fun comprobacionDeEstado(){

        if (terreno?.nombre == "Ciudad"){
            botoncoronado.isVisible = true
            botonsaqueo.isVisible = true
            botonmina.isVisible = false
            botongranja.isVisible = false
        }

        if (terreno?.nombre == "Colina"){
            botoncoronado.isVisible = false
            botonsaqueo.isVisible = false
            botonmina.isVisible = true
            botongranja.isVisible = false
        }

        if (terreno?.nombre == "Llanura"){
            botoncoronado.isVisible = false
            botonsaqueo.isVisible = false
            botonmina.isVisible = false
            botongranja.isVisible = true
        }

        if (terreno?.nombre == "Bosque"){
            botoncoronado.isVisible = false
            botonsaqueo.isVisible = false
            botonmina.isVisible = false
            botongranja.isVisible = false
        }

        if (terreno?.nombre == "Mar"){
            botoncoronado.isVisible = false
            botonsaqueo.isVisible = false
            botonmina.isVisible = false
            botongranja.isVisible = false
        }

        if (terreno?.nombre == "Montana"){
            botoncoronado.isVisible = false
            botonsaqueo.isVisible = false
            botonmina.isVisible = false
            botongranja.isVisible = false
        }

        if (terreno?.nombre == "Terreno desconocido"){
            botoncoronado.isVisible = false
            botonsaqueo.isVisible = false
            botonmina.isVisible = false
            botongranja.isVisible = false
        }

    }
    @FXML
    fun cambiarEstado1() {
        terreno?.estado = "Saqueado"
        fotocoronado.isVisible = true
        fotosaqueado.isVisible= false
        fotomina.isVisible = false
        fotogranja.isVisible = false
    }
    @FXML
    fun cambiarEstado2() {
        terreno?.estado = "Conquistado"
        fotocoronado.isVisible=true
        fotosaqueado.isVisible = false
        fotomina.isVisible = false
        fotogranja.isVisible = false
    }
    @FXML
    fun cambiarEstado3() {
        terreno?.estado = "Con Mina"
        fotocoronado.isVisible=false
        fotosaqueado.isVisible = false
        fotomina.isVisible = true
        fotogranja.isVisible = false
    }
    @FXML
    fun cambiarEstado4() {
        terreno?.estado = "Con Granja"
        fotocoronado.isVisible=false
        fotosaqueado.isVisible = false
        fotomina.isVisible = false
        fotogranja.isVisible = true
    }

    fun enviarDatos(mapaController: MapController){
        this.mapaController=mapaController
    }

    fun imagenesOcultas(){

        val f = File("src\\main\\resources\\images\\ic_corona.png")
        fotocoronado.image = Image(f.toURI().toURL().toString())
        fotocoronado.isVisible=false

        val f2 = File("src\\main\\resources\\images\\ic_granja.png")
        fotogranja.image = Image(f2.toURI().toURL().toString())
        fotogranja.isVisible = false

        val f3= File("src\\main\\resources\\images\\ic_mina.png")
        fotomina.image = Image(f3.toURI().toURL().toString())
        fotomina.isVisible = false

        val f4 = File("src\\main\\resources\\images\\ic_saqueo.png")
        fotosaqueado.image = Image(f4.toURI().toURL().toString())
        fotosaqueado.isVisible = false

    }

}