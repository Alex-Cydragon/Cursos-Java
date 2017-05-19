/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursos.java.Miercoles;

/*
    una interface es un plano de una clase tiene constantes estaticas y etodos 
    abstractos es un mecanimos que permite la abstraccion solo puede contener metodos abstractos
    permite la herecua multiple y no se puede instanciar como una clase abstracta

    razones para unsar una interface
        por interface podemos apoyar la funcionalidad de herencia multiple.
        se utiliza para lograr el desacoplamiento
        java 8: puede contener metodos predeterminados estaticos.
 */
public class InterfaceTest implements show{
        public void print(){
            System.out.println("olaf que ashe");
        }
        public static void main(String[] args) {
        InterfaceTest a = new InterfaceTest();
        a.print();
    }      
}
interface show{
    void print();
}
