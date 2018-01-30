/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package armastrong_project;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;


public class Login_user 
{
    public boolean getlogin(String un,String pw)
    {
        boolean flag = true;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/encryption","root","root");
            Statement st = conn.createStatement();
            
            String query = "select * from user_info where username='"+un+"'";
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next())
            {
                String dbun = rs.getString(1);
                String dbpw = rs.getString(2);
                if(dbun.equals(un) && dbpw.equals(pw))
                {
                    //JOptionPane.showMessageDialog(null, "Successfully Logged In");
                    flag = true;
                }
                else
                    flag = false;
            }
            
            
        } 
        catch (HeadlessException | ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) 
        {
            System.out.println("Exception in Login"+e);
            flag = false;
        }
        
        
        return flag;
    }
}
