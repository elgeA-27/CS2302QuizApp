module com.elgea.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.elgea.quizapp to javafx.fxml;
    exports com.elgea.quizapp;
}
