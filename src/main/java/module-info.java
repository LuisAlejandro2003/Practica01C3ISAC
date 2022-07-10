module com.upchiapas.pruebajavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.upchiapas.pruebajavafx to javafx.fxml;
    exports com.upchiapas.pruebajavafx;
    exports com.upchiapas.pruebajavafx.controllers;
    opens com.upchiapas.pruebajavafx.controllers to javafx.fxml;
}