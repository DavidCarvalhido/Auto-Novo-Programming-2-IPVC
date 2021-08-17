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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author David
 */
public class FXMLRegisterController implements Initializable {

    @FXML
    private TextField usernameField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField pwdField;

    @FXML
    private PasswordField repwdField;

    @FXML
    private Button confirmRegBtn;

    @FXML
    private Button cancelRegBtn;

    /*@FXML
    private Label pwdVerifyLbl;*/
    
    //private EmailValidator emailValidator;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    //Metodo para registar novo utilizador
    @FXML
    public void confirmRegstrFromBtn(ActionEvent event) throws IOException {
        //operações para verificar as passwords e registar as informações pessoais
        //do novo utilizador
        //pwdVerifyLbl.setText("As palavras-passes não coincidem!");

    }

    @FXML
    public void cancelRegstFromBtn(ActionEvent event) throws IOException {
        Stage stage = (Stage) cancelRegBtn.getScene().getWindow();
        stage.close();
    }
    
}
