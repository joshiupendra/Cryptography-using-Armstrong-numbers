/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armastrong_project.data_operations;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Upendra
 */
public class Block_Creator 
{
    public ArrayList create_block(String cont)
    {
        ArrayList bl = new ArrayList();
        try 
        {
            int c = 0;
            for (int j=0;j<cont.length();j++) 
            {
                String b = "";
                for(int i=0;i<12;i++)
                {
                    if(c<cont.length())
                    {
                        b = b + cont.charAt(c);
                        c++;
                    }
                        
                    else
                    {
                        b = b + " ";
                        c++;
                    }
                        
                    
                }
                bl.add(b);
                
                j = c;
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Exception in Block_Creator\t"+e);
        }
        
        
        
        return bl;
    }
    
    
}
