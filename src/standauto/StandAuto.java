/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standauto;

import pg2_tp.*;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author David
 */
public class StandAuto extends Application {
    
    private Stand stand;
    
    @Override
    public void start(Stage stage) throws Exception {
        // Internalização - Inicio
        Locale currentLocale = Locale.getDefault();
        Locale locale = new Locale("stringsEN");
        //ResourceBundle bundle = ResourceBundle.getBundle("resources.labelText", locale); nao funciona a tradução de strings
        // Internalização - Fim
        Parent root = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Seja bem-vindo(a) ao Auto Novo");
        stage.getIcons().add(new Image("/assets/favicon.png"));
        stage.setResizable(false);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    /*public static void loadFileBnry() {
        stand = new Stand("C:\\Users\\David\\Documents\\NetBeansProjects\\Ano_2020\\ProgramacaoTrabalho\\StandAuto\\Ficheiros\\db");
        suc = false;
        cs = 0;
        ts = 0;
        int i=0;
        Vehicle.setCounter(stand.getVeiculos().size());
        Client.setCounter(stand.getClientes().size());
        Sale.setCounter(stand.getVendas().size());
        for(Client c: stand.clients){
            for(Reserve r: c.getReserves()){
                i++;
            }
        }
        Reserve.setCounter(i);
    }*/
    
    /*public static void saveFileBnry() throws IOException{
        stand.saveFileBnry("C:\\Users\\David\\Documents\\NetBeansProjects\\Ano_2020\\ProgramacaoTrabalho\\StandAuto\\Ficheiros\\db2");
    }*/
    
}
