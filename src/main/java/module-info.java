module com.example.macchiatodrive {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.macchiatodrive to javafx.fxml;
    exports com.example.macchiatodrive;
}