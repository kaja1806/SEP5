module com.example.sep5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sep5 to javafx.fxml;
    exports com.example.sep5;
}