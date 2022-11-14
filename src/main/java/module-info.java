module com.example.homeworkmiles {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.homeworkmiles to javafx.fxml;
    exports com.example.homeworkmiles;
}