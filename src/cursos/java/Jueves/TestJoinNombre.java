/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursos.java.Jueves;

/**
 *
 * @author Alex_
 */
public class TestJoinNombre extends Thread{
    public void run(){
        System.out.println("corriendo... ");
    }
    public static void main(String[] args) {
        TestJoinNombre t1 = new TestJoinNombre(),t2 = new TestJoinNombre(),t3 = new TestJoinNombre();
        
         System.out.println("el nombre del hilo 1 es " + t1.getName());
                    System.out.println("el nombre del hilo 2 es " + t2.getName());
                        System.out.println("el nombre del hilo 3 es " + t3.getName());
        
        t1.start();
        t2.start();
        t3.start();
        
        try{
            t1.join();
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
                        
        t1.setName("hilo 1");
            t2.setName("hilo 2");
                t3.setName("hilo 3");
                
                System.out.println("ahora el nombre del hilo 1 es " + t1.getName());
                    System.out.println("ahora el nombre del hilo 2 es " + t2.getName());
                        System.out.println("ahora el nombre del hilo 3 es " + t3.getName());
                
    }
}
