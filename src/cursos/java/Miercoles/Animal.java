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

    
    class Animal{
        void eat (){
            System.out.println("Comiendo Verduras");
        }
    }
    class Dog extends Animal {
        void run(){
            System.out.println("Corriendo a la torre");
        }
    }
    
    class prueba {
        public static void main(String[] args) {
            Dog d = new Dog();
            d.eat();
            d.run();
        }
    }
