/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursos.java.Miercoles;

import java.io.IOException;

/**
 *
 * @author Alex_
 */
public class Excepciones {
    public static void main(String[] args) throws Exception {
        
        
        try{
            M m = new M();
            m.method();
            
        }catch(Exception e){
            System.out.println("Exeption Hangle"); 
        }
                
        
        
        
       /*try{
        int data = 50/0;
        int a[] = new int [5];
        a[5] = 30/0;
       }
       catch(ArithmeticException ae) {
           System.out.println(ae);
       }catch(ArrayStoreException aiobe)
       {
            System.out.println(aiobe);
       }
       catch(Exception e)
       {
            System.out.println(e);
       } finally {
            System.out.println("esta wea se ejecuta siempre aunque truene ");
       }*/
    }
}
class M {
    void method()throws IOException{
        throw new IOException("Error");
    }
}
