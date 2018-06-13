/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uv.fei;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import mx.uv.fei.domain.UserAccount;
import mx.uv.fei.logic.AuthenticationService;
import mx.uv.fei.logic.AuthenticationService.AuthenticationResult;

/**
 *
 * @author rvo
 */
public class LoginDocumentController implements Initializable {
    
    @FXML
    private TextField emailTextBox;
    
    @FXML
    private PasswordField passwordField;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String email=emailTextBox.getText();
        String password=passwordField.getText();
        
        UserAccount userAccount=new UserAccount();
        userAccount.setUsername(email);
        userAccount.setPassword(password);
        
        AuthenticationService authentication= new AuthenticationService();
        
        if(authentication.authenticateUser(userAccount)==AuthenticationResult.USER_AUTHENTICATED){
            System.out.println("Logged");
        } else {
            System.out.println("User is not valid");
        }        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
