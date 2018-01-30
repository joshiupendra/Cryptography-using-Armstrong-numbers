/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armastrong_project.data_operations;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Upendra
 */
public class DecryptController implements Initializable {

    @FXML
    private AnchorPane rootPane;
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
    private Button clear;
    @FXML
    private Button browse;
    @FXML
    private TextField select_file;
    @FXML
    private Button decrypt;
    
    public static String username;
    public static String fname;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
        browse.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        decrypt.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        clear.setStyle("-fx-background-color:blue;-fx-text-fill:white");
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
            stage.setTitle("View Reciever");
        } catch (Exception ex) {
            //Logger.getLogger(User_OperationController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception in User_OperationController\t"+ex);
        }
    }

    @FXML
    private void handleDecryptAction(ActionEvent event) {
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

    @FXML
    private void handleClearButtonAction(ActionEvent event) 
    {
        browse.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        decrypt.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        clear.setStyle("-fx-background-color:green;-fx-text-fill:white");
    }

    @FXML
    private void handleDecryptButtonAction(ActionEvent event) 
    {
        browse.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        decrypt.setStyle("-fx-background-color:green;-fx-text-fill:white");
        clear.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        
        if(!checkall())
        {
            String path = select_file.getText();
            TextFileReader tf = new TextFileReader();
            String cont = tf.getContent(path);
            System.out.println(cont);
            System.out.println("Lenght:\t"+cont.length());
            String a[] = cont.split("###");
            System.out.println(a[0]+"\n"+a[1]);
            String cont1 = a[0];
            String rk = a[1];
            
            Decryptor d = new Decryptor();
            d.decrypt(cont1, rk, fname);
        }
        else
        {
            decrypt.setStyle("-fx-background-color:blue;-fx-text-fill:white");
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Validate Field");
            alert.setHeaderText(null);
            alert.setContentText("Please Select File");
            alert.showAndWait();
        }
    }
    
    public boolean checkall()
    {
        boolean flag;
        
        flag = select_file.getText().isEmpty();
        
        return flag;
    }

    @FXML
    private void handleBrowseButtonAction(ActionEvent event) 
    {
        browse.setStyle("-fx-background-color:green;-fx-text-fill:white");
        decrypt.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        clear.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        
        FileChooser fc = new FileChooser();
        File src = fc.showOpenDialog(null);
        if(src != null)
        {
            String path = src.getAbsolutePath();
            select_file.setText(path);
            String filename = src.getName();
            int l = filename.length() - 4;
            fname = filename.substring(0, l);
            System.out.println("File Name\t"+fname+"\nUser:\t"+username);
        }
        else
        {
            browse.setStyle("-fx-background-color:blue;-fx-text-fill:white");
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Validate Field");
            alert.setHeaderText(null);
            alert.setContentText("Please Select File");
            alert.showAndWait();
        }
    }
    
}
