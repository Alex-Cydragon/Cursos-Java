/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosViernes;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Alex_
 */
public class TestIO3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos = 
                new FileOutputStream("C:\\io.txt");
          FileOutputStream fos2 = 
                new FileOutputStream("C:\\io2.txt");
          ByteArrayOutputStream baos = new ByteArrayOutputStream();
          
          baos.write(65);
          baos.writeTo(fos);
          baos.writeTo(fos2);
          
          baos.flush();
          baos.close();
          System.out.println("Listo");  
    }
    
}
