/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carrera.Java;

/**
 *
 * @author Alex_
 */
public class Tortuga extends Thread{
    @Override
    public void run(){
        int i = 0;
        System.out.println("inicio la tortuga");
        
        while (i<=5){
            try{
                Thread.sleep(5000);
                System.out.println("doy un paso");
            }catch(InterruptedException ie){
                    ie.printStackTrace();
        }
            i++;
                
    }
        System.out.println("ya llego la tortuga");
    }
}


