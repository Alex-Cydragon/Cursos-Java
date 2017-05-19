/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursos.java.Jueves;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Alex_
 */
public class TestIO {
    public static void main(String[] args) {
        
    
        try{
                FileOutputStream fos = 
                        new FileOutputStream("C:\\Hola.txt"); 
                        fos.write(65);
                        fos.close();
                FileInputStream fis = 
                        new FileInputStream("C:\\Hola.txt");
                BufferedInputStream bin = 
                        new BufferedInputStream(fis);
                int i;
                while ((i=bin.read())!= -1){
                System.out.println((char)i);
            }
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
    }
}
