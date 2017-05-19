/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursos.java.Jueves;

import javax.crypto.Cipher;

/**
 *
 * @author Alex_
 */
public class TestSleep extends Thread{
    
    public void run(){
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }catch(InterruptedException ie){
                System.out.println("ie");
            }
        }
        
    }
    public static void main(String[] args) {
        TestSleep t1 = new TestSleep(),
                t2 = new TestSleep();
        
        
        t1.start();
        t2.start();
    }
    
}
