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
public class Animal5 {
    
    void eat(){
        System.out.println("Verdura come el animal");
    }
    
    
}

class Dog5 extends Animal5{
    void eat(){
         System.out.println("Verdura come el animal 1 ");
    }
    void run(){
         System.out.println("Verdura come el animal 2 ");
    }
    void takeShower(){
         System.out.println("Verdura come el animal 3 ");
    }
      void sample(){
        eat();
        run();
        takeShower();
    }
}
class pruebaAnimal{
    public static void main(String[] args) {
        Dog4    d = new Dog4();
        d.imprimir();
        
        Dog5    d5 = new Dog5();
        d5.sample();
        
    }
    
}

class Animal6{
    Animal6(){
        System.out.println("Animal es un animal");
    }
}
