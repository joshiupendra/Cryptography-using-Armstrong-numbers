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
public class Decryptor 
{
    public void decrypt(String cont,String rk,String fname)
    {
        rk = rk.trim();
        String rk1[] = rk.split(" ");
        int r = Integer.parseInt(rk1[0]);
        int g = Integer.parseInt(rk1[1]);
        int bk = Integer.parseInt(rk1[2]);
        int k1 = Integer.parseInt(rk1[3]);
        int k2 = Integer.parseInt(rk1[4]);
        int k3 = Integer.parseInt(rk1[5]);
        //System.out.println(r+"\n"+g+"\n"+b+"\n"+k1+"\n"+k2+"\n"+k3);
        int b[][] = new int[3][3];
        //{k1,k2,k3,(k1*k1),(k2*k2),(k3*k3),(k1*k1*k1),(k2*k2*k2),(k3*k3*k3)}
        b[0][0] = k1 ;
        b[0][1] = k2 ;
        b[0][2] = k3 ;
        b[1][0] = (k1*k1) ;
        b[1][1] = (k2*k2) ;
        b[1][2] = (k3*k3) ;
        b[2][0] = (k1*k1*k1) ;
        b[2][1] = (k2*k2*k2) ;
        b[2][2] = (k3*k3*k3) ;
        
        float m[][] = new float[3][3];
        m[0][0]=(float)((b[1][1]*b[2][2])-(b[1][2]*b[2][1]));
        m[0][1]=-(float)((b[1][0]*b[2][2])-(b[1][2]*b[2][0]));
        m[0][2]=(float)((b[1][0]*b[2][1])-(b[1][1]*b[2][0]));
        m[1][0]=-(float)((b[0][1]*b[2][2])-(b[0][2]*b[2][1]));
        m[1][1]=(float)((b[0][0]*b[2][2])-(b[0][2]*b[2][0]));
        m[1][2]=-(float)((b[0][0]*b[2][1])-(b[0][1]*b[2][0]));
        m[2][0]=(float)((b[0][1]*b[1][2])-(b[0][2]*b[1][1]));
        m[2][1]=-(float)((b[0][0]*b[1][2])-(b[0][2]*b[1][0]));
        m[2][2]=(float)((b[0][0]*b[1][1])-(b[0][1]*b[1][0]));
        
        float ag[][] = new float[3][3];
        ag[0][0]=m[0][0];
        ag[0][1]=m[1][0];
        ag[0][2]=m[2][0];
        ag[1][0]=m[0][1];
        ag[1][1]=m[1][1];
        ag[1][2]=m[2][1];
        ag[2][0]=m[0][2];
        ag[2][1]=m[1][2];
        ag[2][2]=m[2][2];
        
        System.out.println("\nInverse Matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                System.out.print(ag[i][j] + "\t");
            System.out.println();
        }
      
        float x=(float)((b[1][1]*b[2][2])-(b[1][2]*b[2][1]))*b[0][0];
        float y=(float)((b[1][0]*b[2][2])-(b[1][2]*b[2][0]))*b[0][1];
        float z=(float)((b[1][0]*b[2][1])-(b[1][1]*b[2][0]))*b[0][2];

        float d=x-y+z;
        System.out.println("D:\t"+d);
        
        float in[][] = new float[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                in[i][j]=ag[i][j]/d;
        }
        
        String dsc_cont = "";
        Decryptor decry = new Decryptor();
        String cont1[] = cont.split(",");
        
        int row = cont1.length / 12;
        String con[][] = new String[row][12];
        ArrayList al = new ArrayList();
        
        int c=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<12;j++)
            {
                con[i][j] = cont1[c++];
            }
        }
        
        for (String[] con1 : con) 
        {
            int decr[][] = decry.matri(con1);
            System.out.println("ASCII Matrix of Encrypted File");
            for(int h=0;h<3;h++)
            {
            for(int j=0;j<4;j++)
                System.out.print(decr[h][j] + "\t");
            System.out.println();
            }
            
            int mulm[][] = decry.multi(in, decr);
            System.out.println("Multiplied Matrix");
            for(int h=0;h<3;h++)
            {
            for(int j=0;j<4;j++)
                System.out.print(mulm[h][j] + "\t");
            System.out.println();
            }
            
            int subm[][] = decry.subk(mulm, k1, k2, k3);
            String des1 = decry.dsq(subm);
            dsc_cont = dsc_cont + des1;
        }
//   
//        
        String p[] = fname.split("_");
        
        String path = "D:\\Decrypted File\\"+p[0]+"_"+p[1]+"_dsc.txt";
        TextFileWriter tf = new TextFileWriter();
        if(tf.writer(path, dsc_cont))
            JOptionPane.showMessageDialog(null, "File Decrypted Successfully");
        else
            JOptionPane.showMessageDialog(null, "Invalid File Input");
        
    }


    
    public int[][] matri(String[] x2)
    {
        int m[][] = new int[3][4];
        
        System.out.println("\nArray of ASCII:\n");
        for(int i=0;i<x2.length;i++)
            System.out.println("\t"+x2[i]);
        m[0][0] = Integer.parseInt(x2[0].trim());
        m[1][0] = Integer.parseInt(x2[1].trim());
        m[2][0] = Integer.parseInt(x2[2].trim());
        m[0][1] = Integer.parseInt(x2[3].trim());
        m[1][1] = Integer.parseInt(x2[4].trim());
        m[2][1] = Integer.parseInt(x2[5].trim());
        m[0][2] = Integer.parseInt(x2[6].trim());
        m[1][2] = Integer.parseInt(x2[7].trim());
        m[2][2] = Integer.parseInt(x2[8].trim());
        m[0][3] = Integer.parseInt(x2[9].trim());
        m[1][3] = Integer.parseInt(x2[10].trim());
        m[2][3] = Integer.parseInt(x2[11].trim());

        
        return m;
    }
//    
    public int[][] multi(float[][] in,int[][] decr)
    {
        int dcp[][] = new int[3][4];
        for(int i=0;i<3;i++)
      {
         for(int j=0;j<4;j++)
         {
            dcp[i][j]=0;
            float l=0;
            for(int k=0;k<3;k++)
            {
               dcp[i][j]=(int)(dcp[i][j]+(in[i][k]*decr[k][j]));
               l= (l+(in[i][k]*decr[k][j]));
            }
            if(l-dcp[i][j]>0.5)
               dcp[i][j]=dcp[i][j]+1;
            //printf("%f\n%f\n%f\n", );
         }
      }
        
        return dcp;
    }
//    
    public int[][] subk(int[][] x2,int k1,int k2,int k3)
    {
        int q[][] = new int[3][4];
        q[0][0] = x2[0][0] - k1;
        q[0][1] = x2[1][0] - k2;
        q[0][2] = x2[2][0] - k3;
        q[0][3] = x2[0][1] - (k1*k1);
        q[1][0] = x2[1][1] - (k2*k2);
        q[1][1] = x2[2][1] - (k3*k3);
        q[1][2] = x2[0][2] - (k1*k1*k1);
        q[1][3] = x2[1][2] - (k2*k2*k2);
        q[2][0] = x2[2][2] - (k3*k3*k3);
        q[2][1] = x2[0][3] - k1;
        q[2][2] = x2[1][3] - k2;
        q[2][3] = x2[2][3] - k3;
        
        return q;
    }
//    
    public String dsq(int[][] w)
    {
        String z = "";
        z = z + (char)w[0][0];
        z = z + (char)w[0][1];
        z = z + (char)w[0][2];
        z = z + (char)w[0][3];
        z = z + (char)w[1][0];
        z = z + (char)w[1][1];
        z = z + (char)w[1][2];
        z = z + (char)w[1][3];
        z = z + (char)w[2][0];
        z = z + (char)w[2][1];
        z = z + (char)w[2][2];
        z = z + (char)w[2][3];


        
        return z;
   }
}
