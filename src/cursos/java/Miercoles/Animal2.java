/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursos.java.Miercoles;

/**
 *
 * @author Alex_
 */
public class Animal2 {
    void cat(){
        System.out.println("cursos.java.Miercoles.Animal2.cat()");
    }
    
}
    class Dog2 extends Animal2{
        void run(){
            System.out.println("cursos.java.Miercoles.Animal2.Dog2.run()");
        }
    }
    class Cachorro extends Dog2{
            void morirse(){
                System.out.println("cursos.java.Miercoles.Animal2.Dog2.Cachorro.morirse()");
            }
    }
class Herencia{
    public static void main(String[] args) {
            Cachorro cachorro = new Cachorro();
            cachorro.morirse();
            cachorro.run();
        }
}

