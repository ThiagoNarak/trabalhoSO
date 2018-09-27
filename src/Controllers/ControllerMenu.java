package Controllers;

import App.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerMenu implements Initializable {
    private MainApp mainApp;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    public void abrir_sjf(ActionEvent actionEvent) {
        mainApp.abrir_sjf(actionEvent);
    }

    public void abrir_rr(ActionEvent actionEvent) {
        mainApp.abrir_rr(actionEvent);
    }

    public void abrir_ltg(ActionEvent actionEvent) {
        mainApp.abrir_ltg(actionEvent);

    }
}
