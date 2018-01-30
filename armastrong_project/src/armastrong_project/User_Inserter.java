/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armastrong_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Upendra
 */
public class User_Inserter 
{
    public boolean insert(String un,String pw3,String name,String addr,String dob,String mob_num,String email)
    {
        boolean flag = true;
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/encryption","root","root");
            Statement st = conn.createStatement();
            
            String query = "Insert into user_info values('"+un+"','"+pw3+"','"+name+"','"+addr+"','"+dob+"','"+mob_num+"','"+email+"')";
            int x = st.executeUpdate(query);
            flag = x>0;
            
            
        }
        catch(Exception e)
        {
            System.out.println("Exception in User_Inserter"+e);
            flag = false;
        }        
                
        
        return flag;
    }
}
