/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armastrong_project.reciever_operations;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Upendra
 */
public class View_RecieverController implements Initializable {

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
    private TableView table;
    @FXML
    private TableColumn<Reciever, String> name;
    @FXML
    private TableColumn<Reciever, String> ip;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try
        {
        name.setCellValueFactory(cellData -> cellData.getValue().getRname());
                
        ip.setCellValueFactory(cellData -> cellData.getValue().getRip());
        ObservableList<Reciever> allList = Receiver_Fetcher.getallRecords();
        populateTable(allList);
        }
        catch(Exception e)
        {
            System.out.println("Exception in View_RecieverController\t"+e);
        }
    }    

    @FXML
    private void handleEditProfileAction(ActionEvent event) 
    {
        try {
            ((Stage)rootPane.getScene().getWindow()).close();
            Parent root = FXMLLoader.load(getClass().getResource("/armastrong_project/userinfo/Edit_Profile.fxml"));
            
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
    private void handleViewAction(ActionEvent event) {
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

    private void populateTable(ObservableList<Reciever> allList) 
    {
        table.setItems(allList);
        
    }
    
}
