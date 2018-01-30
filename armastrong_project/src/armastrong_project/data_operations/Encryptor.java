/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armastrong_project.data_operations;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Upendra
 */
public class Encryptor 
{
        
    public void encrypt(ArrayList bl,String r,String g,String b,String k1,String k2,String k3,String un,String fname)
    {
        int ri = Integer.parseInt(r);
        int gi = Integer.parseInt(g);
        int bi = Integer.parseInt(b);
        
        int key1 = Integer.parseInt(k1);
        int key2 = Integer.parseInt(k2);
        int key3 = Integer.parseInt(k3);
        
        
        //ArrayList enc = new ArrayList();
        String enc = ""; 
        for(int i=0;i<bl.size();i++)
        {
            String pt = (String) bl.get(i);
            Encryptor e = new Encryptor();
            int et[][] = e.getenc(pt,key1,key2,key3);
            int ascii_e[][] = e.getmulti(et, key1,key2,key3)  ;
            String ec = e.getec(ascii_e);
            enc = enc + ec;
            
        }
        System.out.println(enc);
        String path = "D:\\Encrypted File" + "\\" + fname + "_" + un + "_enc.txt";
        TextFileWriter tf = new TextFileWriter();
        enc = enc + "###" + r + " " + g + " " + b + " " + k1 + " " + k2 + " " + k3; 
        if(tf.writer(path, enc))
            JOptionPane.showMessageDialog(null,"File Writed Successfully...");
        else
            JOptionPane.showMessageDialog(null,"Error\nTry Again....");
        
    }
    
    public int[][] getenc(String pt,int k1,int k2, int k3)
    {
        int enc[][] = new int[3][4];
        enc[0][0] = ((int)pt.charAt(0)+k1);
        enc[1][0] = ((int)pt.charAt(1)+k2);
        enc[2][0] = ((int)pt.charAt(2)+k3);
        enc[0][1] = ((int)pt.charAt(3)+(k1*k1));
        enc[1][1] = ((int)pt.charAt(4)+(k2*k2));
        enc[2][1] = ((int)pt.charAt(5)+(k3*k3));
        enc[0][2] = ((int)pt.charAt(6)+(k1*k1*k1));
        enc[1][2] = ((int)pt.charAt(7)+(k2*k2*k2));
        enc[2][2] = ((int)pt.charAt(8)+(k3*k3*k3));
        enc[0][3] = ((int)pt.charAt(9)+k1);
        enc[1][3] = ((int)pt.charAt(10)+k2);
        enc[2][3] = ((int)pt.charAt(11)+k3);
        
        return enc;
    }
    
    public int[][] getmulti(int[][] enc,int k1,int k2,int k3)
    {
        int multi[][] = new int[3][4];
        int key[][] = new int[3][3];
        //{k1,k2,k3,(k1*k1),(k2*k2),(k3*k3),(k1*k1*k1),(k2*k2*k2),(k3*k3*k3)};
        key[0][0] = k1;
        key[0][1] = k2;
        key[0][2] = k3;
        key[1][0] = (k1*k1);
        key[1][1] = (k2*k2);
        key[1][2] = (k3*k3);
        key[2][0] = (k1*k1*k1);
        key[2][1] = (k2*k2*k2);
        key[2][2] = (k3*k3*k3);
        
        
        for(int i=0;i<3;i++)
        {
         for(int j=0;j<4;j++)
         {
            multi[i][j]=0;
            
            for(int k=0;k<3;k++)
            {
               multi[i][j]=(int)(multi[i][j]+(key[i][k]*enc[k][j]));
               
            }
            
         }
        }
        System.out.println("Encrypted Matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
                System.out.print("  "+multi[i][j]);
            System.out.println();
        }
        
        return multi;
    }
    
    public String getec(int[][] x)
    {
        String ec = "";
        ec = ec + x[0][0] + ",";
        ec = ec + x[1][0] + ",";
        ec = ec + x[2][0]+ ",";
        ec = ec + x[0][1]+ ",";
        ec = ec + x[1][1]+ ",";
        ec = ec + x[2][1]+ ",";
        ec = ec + x[0][2]+ ",";
        ec = ec + x[1][2]+ ",";
        ec = ec + x[2][2]+ ",";
        ec = ec + x[0][3]+ ",";
        ec = ec + x[1][3]+ ",";
        ec = ec + x[2][3]+ ",";
        
        return ec;
    }
}
