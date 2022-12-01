module com.example.calculatrice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculatrice to javafx.fxml;
    exports com.example.calculatrice;
}