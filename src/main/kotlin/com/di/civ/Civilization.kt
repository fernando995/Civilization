package com.di.civ

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class Civilization : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(Civilization::class.java.getResource("map.fxml"))
        val scene = Scene(fxmlLoader.load(), 1000.0, 750.0)
        stage.title = "Hello!"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(Civilization::class.java)
}