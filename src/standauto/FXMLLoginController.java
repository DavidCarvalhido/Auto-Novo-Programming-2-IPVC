/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standauto;

import pg2_tp.*;

import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author David
 */
public class FXMLLoginController implements Initializable {

    @FXML
    private Pane loginPane;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField pwdField;

    @FXML
    private Button loginBtn;

    @FXML
    private Button registerBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    /**
     * Função auxiliar que permite obter o nome de um cliente no formato correto
     * @param nomeCompleto nome no formato originalmente introduzido
     * @return nome completo no formato correto (nomes separados por um espaço, com a primeira letra maiúscula e as restantes minúsculas)
     */
    // Verifica as credenciais e abre o menu principal
    @FXML
    public void loginVerifyBtn(ActionEvent event) throws IOException {
        //if(Boolean.getBoolean(name)usernameField == "admin" && pwdField == "admin")
            //AnchorPane anchoP = FXMLLoader.load(getClass().getResource("FXMLAdminMenu.fxml"));
            Parent root = FXMLLoader.load(getClass().getResource("FXMLUserMenu.fxml"));
            //Parent root = FXMLLoader.load(getClass().getResource("Ainternalization.fxml"));

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Menu de administrador - Auto novo");
            stage.getIcons().add(new Image("/assets/favicon.png"));
            stage.setResizable(true);
            stage.centerOnScreen();
            stage.setMaximized(true);
            stage.show();
    }

    /**
     * Função auxiliar que permite obter o nome de um cliente no formato correto
     * @param nomeCompleto nome no formato originalmente introduzido
     * @return nome completo no formato correto (nomes separados por um espaço, com a primeira letra maiúscula e as restantes minúsculas)
     */
    //Método para abrir a janela de registo (para ja abre a janela de registo e fecha a janela de login)
    @FXML
    private void openRegisterForm(ActionEvent event) throws IOException {
        /*FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("FXMLRegister.fxml"));
        Parent root = (Parent) fXMLLoader.load();*/
        Parent root = FXMLLoader.load(getClass().getResource("FXMLRegister.fxml"));

        //Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage stage = new Stage();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Criar nova conta - Auto Novo");
        stage.getIcons().add(new Image("/assets/favicon.png"));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    //Ao clicar no botão, o texto muda de cor
    @FXML
    public void clickRegister(ActionEvent action) throws Exception {
        //mudar a cor do texto no botao de registo de conta
    }
    
}
