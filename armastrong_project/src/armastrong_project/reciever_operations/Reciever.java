/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armastrong_project.reciever_operations;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Upendra
 */
public class Reciever 
{
    private final SimpleStringProperty name;
    private final SimpleStringProperty ip;
    
    public Reciever()
    {
        super();
        this.name = new SimpleStringProperty();
        this.ip = new SimpleStringProperty();
    }
    
    public String getname()
    {
        return name.get();
    }
    
    public void setname(String nname)
    {
        this.name.set(nname);
    }
    
    public SimpleStringProperty getRname()
    {
        return name;
    }
    
    public String getip()
    {
        return ip.get();
    }
    
    public void setip(String ipp)
    {
        this.ip.set(ipp);
    }
    
    public SimpleStringProperty getRip()
    {
        return ip;
    }
}
