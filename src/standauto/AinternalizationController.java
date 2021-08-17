/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standauto;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author David
 */
public class AinternalizationController implements Initializable {
    
    @FXML
    private Label labelLan;
    
    private ResourceBundle bundle;
    private Locale locale;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private void btnEn(ActionEvent event) {
        loadLang("en");
    }
    @FXML
    private void btnRU(ActionEvent event) {
        loadLang("ru");
    }
    @FXML
    private void btnAZ(ActionEvent event) {
        loadLang("az");
    }
    @FXML
    private void btnTR(ActionEvent event) {
        loadLang("tr");
    }
    private void loadLang(String lang) {
        locale = new Locale(lang);
        bundle = ResourceBundle.getBundle("com.lang", locale);
        labelLan.setText(bundle.getString("labelLan"));
    }
    
}
