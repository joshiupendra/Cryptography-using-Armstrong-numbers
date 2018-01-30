/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armastrong_project.data_operations;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
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
import javax.swing.JFileChooser;

/**
 * FXML Controller class
 *
 * @author Upendra
 */
public class EncryptController implements Initializable {

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
    private TextField select_file;
    @FXML
    private Button browse;
    @FXML
    private TextField rtext;
    @FXML
    private TextField btext;
    @FXML
    private TextField gtext;
    @FXML
    private TextField key1;
    @FXML
    private TextField key3;
    @FXML
    private TextField key2;
    @FXML
    private Button rbutton;
    @FXML
    private Button bkbutton;
    @FXML
    private Button wbutton;
    @FXML
    private Button ybutton;
    @FXML
    private Button bbutton;
    @FXML
    private Button gbutton;
    @FXML
    private Button encrypt;
    @FXML
    private Button clear;

    public static String username;
    public static String fname;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        browse.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        encrypt.setStyle("-fx-background-color:blue;-fx-text-fill:white");
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
    private void handleEncryptAction(ActionEvent event) {
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
            stage.setTitle("View Reciever");
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

    @FXML
    private void handleBrowseButtonAction(ActionEvent event) 
    {
        browse.setStyle("-fx-background-color:green;-fx-text-fill:white");
        encrypt.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        clear.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        FileChooser fc = new FileChooser();
        //fc.showOpenDialog(fc);
        //File src = fc.getSelectedFile();
        //String path = src.getAbsolutePath();
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

    @FXML
    private void rbuttonAction(ActionEvent event) 
    {
        rtext.setText("255");
        gtext.setText("0");
        btext.setText("0");
    }

    @FXML
    private void bkbuttonAction(ActionEvent event) 
    {
        rtext.setText("0");
        gtext.setText("0");
        btext.setText("0");
    }

    @FXML
    private void wbuttonAction(ActionEvent event) 
    {
        rtext.setText("255");
        gtext.setText("255");
        btext.setText("255");
    }

    @FXML
    private void ybuttonAction(ActionEvent event) 
    {
        rtext.setText("255");
        gtext.setText("255");
        btext.setText("0");
    }

    @FXML
    private void bbuttonAction(ActionEvent event) 
    {
        rtext.setText("0");
        gtext.setText("0");
        btext.setText("255");
    }

    @FXML
    private void gbuttonAction(ActionEvent event) 
    {
        rtext.setText("0");
        gtext.setText("255");
        btext.setText("0");
    }

    @FXML
    private void handleEncryptButtonAction(ActionEvent event) 
    {
        browse.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        encrypt.setStyle("-fx-background-color:green;-fx-text-fill:white");
        clear.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        
        if(!checkall())
        {
            String path = select_file.getText();
            TextFileReader tf = new TextFileReader();
            String cont = tf.getContent(path);
            System.out.println(cont);
            System.out.println("Lenght:\t"+cont.length());
            
            ArrayList bl = new ArrayList(); 
            Block_Creator bo = new Block_Creator();
            bl = bo.create_block(cont);
            System.out.println(bl);
            Encryptor e = new Encryptor();
            
            String r = rtext.getText();
            String g = gtext.getText();
            String b = btext.getText();
            
            String k1 = key1.getText();
            String k2 = key2.getText();
            String k3 = key3.getText();
            
            e.encrypt(bl, r, g, b, k1, k2, k3, username, fname);
            
        }
        else
        {
            encrypt.setStyle("-fx-background-color:blue;-fx-text-fill:white");
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Validate Field");
            alert.setHeaderText(null);
            alert.setContentText("Please Fill all Fields");
            alert.showAndWait();
        }
        
    }
    
    public boolean checkall()
    {
        boolean flag;
        
        flag = select_file.getText().isEmpty() | rtext.getText().isEmpty() | gtext.getText().isEmpty() |
                btext.getText().isEmpty() | key1.getText().isEmpty() | key2.getText().isEmpty() | key3.getText().isEmpty();
        
        return flag;
    }

    @FXML
    private void handleClearButtonAction(ActionEvent event) 
    {
        browse.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        encrypt.setStyle("-fx-background-color:blue;-fx-text-fill:white");
        clear.setStyle("-fx-background-color:green;-fx-text-fill:white");
        
        rtext.setText("");
        gtext.setText("");
        btext.setText("");
        key1.setText("");
        key2.setText("");
        key3.setText("");
        select_file.setText("");
    }
    
}
