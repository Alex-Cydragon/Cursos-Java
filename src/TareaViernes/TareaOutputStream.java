/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaViernes;

/**
 *
 * @author Alex_
 */
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class TareaOutputStream {
    static String laPalabra = "";
    public static void main(String[] args) {
        IA ia = new IA();
        ia.start();
        Thread persona = new Thread(new Persona());
        persona.start();
    }
}

class IA extends Thread{
    @Override
    public void run(){
        int i = 0;
        System.out.println("Holaa Mucho gusto soy la IA que recuerda, cuentame algo durante cierto tiempo y luego te lo dire jeje");
        
        // todo esto dentro de un if en una variable que puedan usar todas 
        while (i<=8){
                    try{
                        Thread.sleep(1000);
                        if (i >= 5){
                            if(i == 8){
                                 System.out.println("IA: Se acavo!");
                                 //i = 0;
                            }
                            else if (i == 6){
                                 System.out.println("IA: ....");
                            }
                            else if (i == 7){
                                 System.out.println("IA: ....");
                            }
                            else{
                                 System.out.println("*la IA parece algo impaciente ");
                            }
                        }
                        else{
                            System.out.println("esperando...");
                        }
                    }catch(InterruptedException ie){
                            ie.printStackTrace();
                }
            
        i++;             
        }
        try{
               FileInputStream recordarlo = 
                        new FileInputStream("C:\\Recuerdo.txt");
                BufferedInputStream bin = 
                        new BufferedInputStream(recordarlo);
                if(bin.read() == -1){
                      System.out.println("IA: no escriviste nada loser :D ");
                }else{ 
                    System.out.println("IA: lo que escribiste fue...");

                int i2 = 0;
                while ((i2=bin.read())!= -1){
                    System.out.println((char)i2);
                }
                }
                System.out.println("IA: Muy bien! ( ͡° ͜ʖ ͡°)");
    
        }
        catch(IOException ioe)
        {
            System.out.println("IA: no escriviste nada loser :D "
                    + ioe);
        }
    }
}


class Persona implements Runnable{
    @Override
    public void run(){
        System.out.println("pista... comienza a escribir");
         
        try{
                FileOutputStream rec = 
                        new FileOutputStream("C:\\Recuerdo.txt"); 
                 Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
                 
                 byte[] contentInBytes = entradaEscaner.nextLine().getBytes();
                        rec.write(contentInBytes);
                        rec.close();                      
                        
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
    }
    
}