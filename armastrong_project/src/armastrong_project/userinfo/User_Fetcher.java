/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armastrong_project.userinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Upendra
 */
public class User_Fetcher 
{
    
    
    public DataKeeper getall(String user)
    {
        DataKeeper d = new DataKeeper();
        try
        {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/encryption","root","root");
            Statement st = conn.createStatement();
            
            String query = "select * from user_info where username='"+user+"'";
            
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next())
            {
                
                d.name = rs.getString(3);
                d.address = rs.getString(4);
                d.dob = rs.getString(5);
                d.mo_num = rs.getString(6);
                d.email = rs.getString(7);
            }
            
            
        }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) 
        {
            System.out.println("Exception in User_Fetcher"+e);
        }
        
        
        return d;
    }
}
