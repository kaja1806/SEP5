module com.example.sep5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens sep5Project to javafx.fxml;
    exports sep5Project;
}