/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standauto;

import pg2_tp.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author David
 */
public class FXMLAdminMenuController implements Initializable {
    
    @FXML
    private Label titleLbl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void addVehicleBtn(ActionEvent event) throws IOException {
        
    }
    
    @FXML
    public void newSaleBtn(ActionEvent event) throws IOException {
        
    }
    
    @FXML
    public void allVehiclesBtn(ActionEvent event) throws IOException {
        
    }
    
    @FXML
    public void allClientsBtn(ActionEvent event) throws IOException {
        
    }
    
    public void loadPage(String page) {
        Parent root = null;
        
        try {
            root = FXMLLoader.load(getClass().getResource(page+".fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FXMLAdminMenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
