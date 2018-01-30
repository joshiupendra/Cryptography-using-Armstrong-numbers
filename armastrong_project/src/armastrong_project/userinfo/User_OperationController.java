/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armastrong_project.userinfo;

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
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Upendra
 */
public class User_OperationController implements Initializable {

    @FXML
    private MenuItem edit_profile;
    @FXML
    private MenuItem add_re;
    @FXML
    private MenuItem update_re;
    @FXML
    private MenuItem delete_re;
    @FXML
    private MenuItem view_re;
    @FXML
    private MenuItem encry;
    @FXML
    private MenuItem decry;
    @FXML
    private MenuItem send;
    @FXML
    private MenuItem recieve;
    @FXML
    private MenuItem exit;
    @FXML
    private AnchorPane rootPane;
    @FXML
    private Label user_lable;
    
    public static String user = "";

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        user_lable.setText(user);
        Edit_ProfileController.username = user;
    }    

    @FXML
    private void handleEditProfileAction(ActionEvent event) 
    {
         try {
            ((Stage)rootPane.getScene().getWindow()).close();
            Parent root = FXMLLoader.load(getClass().getResource("Edit_Profile.fxml"));
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Edit Profile");
        } catch (Exception ex) {
            //Logger.getLogger(User_OperationController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception in User_OperationController\t"+ex);
        }
    }

    @FXML
    private void handleAddAction(ActionEvent event) 
    {
        try {
            ((Stage)rootPane.getScene().getWindow()).close();
            Parent root = FXMLLoader.load(getClass().getResource("/armastrong_project/reciever_operations/Add_Reciever.fxml"));
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Add Reciever");
        } catch (Exception ex) {
            //Logger.getLogger(User_OperationController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception in User_OperationController\t"+ex);
        }
    }

    @FXML
    private void handleUpdateAction(ActionEvent event) 
    {
        try {
            ((Stage)rootPane.getScene().getWindow()).close();
            Parent root = FXMLLoader.load(getClass().getResource("/armastrong_project/reciever_operations/Update_Reciever.fxml"));
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Update Reciever");
        } catch (Exception ex) {
            //Logger.getLogger(User_OperationController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception in User_OperationController\t"+ex);
        }
    }

    @FXML
    private void handleDeleteAction(ActionEvent event) 
    {
        try {
            ((Stage)rootPane.getScene().getWindow()).close();
            Parent root = FXMLLoader.load(getClass().getResource("/armastrong_project/reciever_operations/Delete_Reciever.fxml"));
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Delete Reciever");
        } catch (Exception ex) {
            //Logger.getLogger(User_OperationController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception in User_OperationController\t"+ex);
        }
    }

    @FXML
    private void handleViewAction(ActionEvent event) 
    {
        try {
            ((Stage)rootPane.getScene().getWindow()).close();
            Parent root = FXMLLoader.load(getClass().getResource("/armastrong_project/reciever_operations/View_Reciever.fxml"));
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setTitle("View Reciever");
        } catch (Exception ex) {
            //Logger.getLogger(User_OperationController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception in User_OperationController\t"+ex);
        }
    }

    @FXML
    private void handleEncryptAction(ActionEvent event) 
    {
        try {
            ((Stage)rootPane.getScene().getWindow()).close();
            Parent root = FXMLLoader.load(getClass().getResource("/armastrong_project/data_operations/Encrypt.fxml"));
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Encrypt File");
        } catch (Exception ex) {
            //Logger.getLogger(User_OperationController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception in User_OperationController\t"+ex);
        }
    }

    @FXML
    private void handleDecryptAction(ActionEvent event) 
    {
        try {
            ((Stage)rootPane.getScene().getWindow()).close();
            Parent root = FXMLLoader.load(getClass().getResource("/armastrong_project/data_operations/Decrypt.fxml"));
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Decrypt File");
        } catch (Exception ex) {
            //Logger.getLogger(User_OperationController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception in User_OperationController\t"+ex);
        }
    }

    @FXML
    private void handleSendAction(ActionEvent event) {
    }

    @FXML
    private void handleRecieveAction(ActionEvent event) {
    }

    @FXML
    private void handleExitAction(ActionEvent event) 
    {
        try {
            ((Stage)rootPane.getScene().getWindow()).close();
            Parent root = FXMLLoader.load(getClass().getResource("/armastrong_project/Login.fxml"));
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            stage.setTitle("User Login");
        } catch (Exception ex) {
            //Logger.getLogger(User_OperationController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception in User_OperationController\t"+ex);
        }
    }
    
}
