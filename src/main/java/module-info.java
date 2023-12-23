module com.example.gpacalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.gpacalculator to javafx.fxml;
    exports com.example.gpacalculator;
}