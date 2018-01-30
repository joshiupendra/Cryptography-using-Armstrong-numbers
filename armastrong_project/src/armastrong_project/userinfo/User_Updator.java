/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armastrong_project.userinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Upendra
 */
public class User_Updator 
{
    public boolean update(String un,String pw3,String name,String addr,String dob,String mob_num,String email)
    {
        boolean flag = true;
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/encryption","root","root");
            Statement st = conn.createStatement();
            
            //username, password, name, addr, dob, mob_num, email
            String query = "update user_info set password='"+pw3+"',name='"+name+"',addr='"+addr+"',dob='"+dob+"',mob_num='"+mob_num+"',email='"+email+"' where username='"+un+"'";
            int x = st.executeUpdate(query);
            flag = x>0;
            
            
        }
        catch(Exception e)
        {
            System.out.println("Exception in User_Updator"+e);
            flag = false;
        }        
                
        
        return flag;
    }
}
