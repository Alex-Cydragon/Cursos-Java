/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosViernes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;

/**
 *
 * @author Alex_
 */
public class TestIO2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = 
                    new FileInputStream("C:\\a.txt");
        FileInputStream fis2 =
                    new FileInputStream("C:\\b.txt");
        
        SequenceInputStream is = 
                new SequenceInputStream (fis, fis2);
    }
    
}
