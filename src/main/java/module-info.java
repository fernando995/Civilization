module com.di.civ {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.di.civ to javafx.fxml;
    exports com.di.civ;
}