module com.example.flakybanshee {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.flakybanshee to javafx.fxml;
    exports com.example.flakybanshee;
}