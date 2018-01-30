/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armastrong_project;

import armastrong_project.data_operations.DecryptController;
import armastrong_project.data_operations.EncryptController;
import armastrong_project.userinfo.User_OperationController;
import static java.awt.SystemColor.window;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Upendra
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label titleLable;
    @FXML
    private Button register;
    @FXML
    private Button login;
    @FXML
    private Button clearb;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        login.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        register.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        clearb.setStyle("-fx-background-color:blue;-fx-text-fill:white");
    }    

    @FXML
    private void handleLoginButtonAction(ActionEvent event) 
    {
        login.setStyle("-fx-background-color:green;-fx-text-fill:white");
        if(!checkall())
        {
        titleLable.setText("User Login");
        titleLable.setStyle("-fx-background-color:black;-fx-text-fill:white");
        login.setStyle("-fx-background-color:green;-fx-text-fill:white");
        clearb.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        register.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        String uname = username.getText();
        //String pwd = DigestUtils.shaHex(password.getText());
        String pw1 = password.getText();
        String pwd = String.valueOf(pw1);
        System.out.println("Usename:\t"+uname+"\n\nPassword:\t"+pwd);
        Login_user lu = new Login_user();
        
        if(lu.getlogin(uname, pwd))
        {
            System.out.println("\nSuccessful Login\n\n\n");
            Stage stage2 = (Stage) login.getScene().getWindow();
            stage2.close();
            User_OperationController.user = uname;
            EncryptController.username = uname;
            DecryptController.username = uname;
            
            try {
            Parent root = FXMLLoader.load(getClass().getResource("userinfo/User_Operation.fxml"));
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.DECORATED);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Registration");
            
        } catch (Exception ex) {
            //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception in FXMLDocumentController\t"+ex);
        }
        }
            
        else
        {
            titleLable.setText("Invalid Credentials");
            titleLable.setStyle("-fx-background-color:red;-fx-text-fill:white");
            login.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        }
        }
        else
        {
            login.setStyle("-fx-background-color:blue;-fx-text-fill:white");
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Validate Field");
            alert.setHeaderText(null);
            alert.setContentText("Please Fill All Info");
            alert.showAndWait();
        }
            
    }
    
    public boolean checkall()
    {
        boolean flag;
        
        flag = username.getText().isEmpty() | password.getText().isEmpty();
        
        return flag;
    }

    @FXML
    private void handleClearButtonAction(ActionEvent event) 
    {
        username.setText("");
        password.setText("");
        login.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        register.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        clearb.setStyle("-fx-background-color:green;-fx-text-fill:white");
    }

    @FXML
    private void handleRegisterButtonAction(ActionEvent event) 
    {
        register.setStyle("-fx-background-color:green;-fx-text-fill:white");
        login.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        clearb.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        try {
//            StackPane sp = new StackPane();
//            sp.setOnMouseClicked(e -> Platform.exit());
            Stage stage1 = (Stage) register.getScene().getWindow();
            stage1.close();
            
            Parent root = FXMLLoader.load(getClass().getResource("Registration_frame.fxml"));
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Registration");
            
        } catch (Exception ex) {
            //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception in FXMLDocumentController\t"+ex);
        }
    }
    
}
