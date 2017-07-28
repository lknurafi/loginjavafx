/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author FCMI
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Label lbl2;
    @FXML
    private TextField tex1;
    @FXML
    private TextField tex2;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        name = tex1.getText();
        password = tex2.getText();
            if (name.equals("") && password.equals("")){
                actionTarget.setFill(Color.FIREBRICK);
                actionTarget.setText("Jeneng Karo Kewote Salah KER !");
            }else if (name.equals("")){
                actionTarget.setFill(Color.FIREBRICK);
                actionTarget.setText("Pieee To kok jek SALAH jeneng!");
               
            }else if (password.equals("")){
                actionTarget.setFill(Color.FIREBRICK);
                actionTarget.setText("Ilengeeeen Po'o KER Kewote!");
               
           }else if (name.equals("nur") && password.equals("nur")){
                try {
                    
                } catch (Exception ex) {
                    Logger.getLogger(FormFXExample.class.getName()).log(Level.SEVERE, null, ex);
                }
                   
            }else{
                    actionTarget.setFill(Color.FIREBRICK);
                    actionTarget.setText("Can't open CSSExample Window");
            }
           
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
