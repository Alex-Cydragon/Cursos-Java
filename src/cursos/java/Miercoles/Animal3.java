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
public class Animal3 {
    void eat(){
        System.out.println("Comiendo Verduras");
    }
}
    class Perro extends Animal3{
        void run(){
            System.out.println("Corriendo");
        }
    }
    class Cat extends Animal3{
        void mew(){
            System.out.println("miau Dijo el gato");
        }
    }
    class HerenciaJerarquica{
        public static void main(String[] args) {
            Cat c = new Cat();
            c.mew();
            c.eat();
        }
    }
    

