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
public class Liebre implements Runnable{
    @Override
    public void run(){
        int i = 0;
        System.out.println("inicio la liebre");
        
        while (i<=5){
            try{
                Thread.sleep(2000);
                System.out.println("doy un salto");
            }catch(InterruptedException ie){
                    ie.printStackTrace();
        }
            i++;
                
    }
        System.out.println("gano la liebre");
    }
    
}
