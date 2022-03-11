module fr.simon2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens fr.simon2 to javafx.fxml;

    exports fr.simon2;
}
