module com.example.multipagedemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.multipagedemo to javafx.fxml;
    exports com.example.multipagedemo;
}