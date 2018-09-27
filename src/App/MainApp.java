package App;


import Controllers.ControllerLTG;
import Controllers.ControllerMenu;
import Controllers.ControllerRR;
import Controllers.ControllerSJF;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    private MainApp mainApp;
//    private GridPane gridPane;

    @Override
    public void start(Stage stage) throws Exception {

        this.primaryStage = stage;


        initRoot();
    }

    public void initRoot() {
        try {
            //Carregar FXML contendo o painel principal com o menu
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/Views/Menu.fxml"));
            rootLayout = loader.load();


            //Inserir o painel principal no stage principal
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

            //Armazenar o stage principal no controller do painel principal
            ControllerMenu controller = loader.getController();
            controller.setMainApp(this);
        } catch (IOException e) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
        }
    }

//    public void exibirCadastro() {
//        try {
//            //Carregar FXML contendo o painel com a pesquisa de produto
//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(getClass().getResource("/view/CadastrarCliente.fxml"));
//            AnchorPane cadastroUsuario = (AnchorPane) loader.load();
//
//            //Inserir o painel de pesquisa de produto no painel principal
//            rootLayout.setCenter(cadastroUsuario);
//
//            //Armazenar o stage principal no controller do painel principal
//            ControllerCadastrarCliente controller = loader.getController();
//            controller.setMainApp(this);
//        } catch (IOException ex) {
//            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    public void fecharTelaAtual() {
        rootLayout.setCenter(null);
    }



    public static void main(String[] args) {
        launch(args);
    }

    public void abrir_sjf(ActionEvent actionEvent) {
        try {
//            //Carregar FXML contendo o painel com a pesquisa de produto
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/Views/telaSJF.fxml"));
            AnchorPane sjf = (AnchorPane) loader.load();
//
            //Inserir o painel de pesquisa de produto no painel principal
            rootLayout.setCenter(sjf);
//
            //Armazenar o stage principal no controller do painel principal
            ControllerSJF controller = loader.getController();
            controller.setMainApp(this);
            System.out.println("SJF");
        } catch (IOException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void abrir_rr(ActionEvent actionEvent) {
        try {
//            //Carregar FXML contendo o painel com a pesquisa de produto
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/Views/telaRR.fxml"));
            AnchorPane sjf = (AnchorPane) loader.load();
//
            //Inserir o painel de pesquisa de produto no painel principal
            rootLayout.setCenter(sjf);
//
            //Armazenar o stage principal no controller do painel principal
            ControllerRR controller = loader.getController();
            controller.setMainApp(this);
            System.out.println("RR");
        } catch (IOException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void abrir_ltg(ActionEvent actionEvent) {
        try {
//            //Carregar FXML contendo o painel com a pesquisa de produto
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/Views/telaLTG.fxml"));
            AnchorPane sjf = (AnchorPane) loader.load();
//
            //Inserir o painel de pesquisa de produto no painel principal
            rootLayout.setCenter(sjf);
//
            //Armazenar o stage principal no controller do painel principal
            ControllerLTG controller = loader.getController();
            controller.setMainApp(this);
            System.out.println("LTG");
        } catch (IOException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}

