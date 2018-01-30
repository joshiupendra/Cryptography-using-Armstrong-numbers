/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armastrong_project.reciever_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Upendra
 */
public class Receiver_Fetcher 
{

    private static ObservableList<Reciever> getAllObjects(ResultSet rs) throws ClassNotFoundException, SQLException
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ObservableList<Reciever> allList = FXCollections.observableArrayList();
        try 
        {
            
        
            while(rs.next())
            {
                Reciever rec = new Reciever();
                rec.setname(rs.getString(1));
                rec.setip(rs.getString(2));
                allList.add(rec);
            }
        } 
        catch (Exception e) {
        }
        return allList;
    }
    public String getip(String user)
    {
        String ip = "";
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/encryption","root","root");
            Statement st = conn.createStatement();
            
            String query = "select * from transfer_info where user='"+user+"'";
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next())
                ip = rs.getString(2);
            
        }
        catch(Exception e)
        {
            System.out.println("Exception in transfer_info\t"+e);
        }
        return ip;
    }
    
    public DataKeeper getall()
    {
        DataKeeper a = new DataKeeper();
        try
        {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/encryption","root","root");
            Statement st = conn.createStatement();
            Statement st1 = conn.createStatement();
            
            String query = "select * from transfer_info";
            
            ResultSet rs = st.executeQuery(query);
            ResultSet rs1 = st1.executeQuery(query);
            
            int rows = 0;
            while(rs1.next())
            {
                rows++;
            }
            String d[][] = new String[rows][2];
            int i = 0;
            while(rs.next())
            {
                
                d[i][0] = rs.getString(1);
                d[i][1] = rs.getString(2);
                
                //System.out.println(d[i][0]+"\t"+d[i][1]);
                i++;
            }
            a.alldata = d;
            
        }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) 
        {
            System.out.println("Exception in Receiver_Fetcher"+e);
        }
        
        
        return a;
    }
    
    public static ObservableList<Reciever> getallRecords() throws ClassNotFoundException, SQLException
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/encryption","root","root");
            Statement st = conn.createStatement();
            
            String query = "select * from transfer_info";
            ResultSet rs = st.executeQuery(query);
            
            ObservableList<Reciever> allList = getAllObjects(rs);
            return allList;
            
        }
        catch(Exception e)
        {
            System.out.println("Exception in transfer_info\t"+e);
        }
        return null;
    }
}
