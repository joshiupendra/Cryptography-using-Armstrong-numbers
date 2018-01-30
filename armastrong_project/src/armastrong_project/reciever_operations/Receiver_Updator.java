/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armastrong_project.reciever_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Upendra
 */
public class Receiver_Updator 
{
    public boolean update(String user,String ip)
    {
        boolean flag = true;
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/encryption","root","root");
            Statement st = conn.createStatement();
            
            //username, password, name, addr, dob, mob_num, email
            String query = "update transfer_info set ip='"+ip+"' where user='"+user+"'";
            int x = st.executeUpdate(query);
            flag = x>0;
            
            
        }
        catch(Exception e)
        {
            System.out.println("Exception in Receiver_Updator"+e);
            flag = false;
        }        
                
        
        return flag;
    }
}
