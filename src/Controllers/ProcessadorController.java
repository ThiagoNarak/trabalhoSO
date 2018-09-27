package Controllers;


import Beans.Processo;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

@Deprecated
public class ProcessadorController extends Thread implements Initializable{
    private Processo processo;

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }
}
