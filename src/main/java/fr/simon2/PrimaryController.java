package fr.simon2;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class PrimaryController {

    @FXML
    ImageView vueImage;

    @FXML
    private Button Cbutton;

    @FXML
    private Button Vbutton;

    @FXML
    void SwitchToComptable(ActionEvent event) throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    void SwitchToVisiteur(ActionEvent event) throws IOException {
        App.setRoot("secondary");
    }

}
