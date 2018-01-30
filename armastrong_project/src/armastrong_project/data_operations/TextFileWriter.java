/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armastrong_project.data_operations;

import java.io.FileOutputStream;

/**
 *
 * @author Upendra
 */
public class TextFileWriter {
    public boolean writer(String path,String cont)
    {
        boolean flag = true;
        try 
        {
            FileOutputStream f = new FileOutputStream(path);
            for(int i=0; i<cont.length(); i++)
            {
                char ch = cont.charAt(i);
                int x = (int)ch;
                f.write(x);
            }   
            f.close();
        } 
        catch (Exception e) 
        {
            System.out.println("Exception in TextFileWriter\t"+e);
            flag = false;
        }
        
        return flag;
    }
    
}
