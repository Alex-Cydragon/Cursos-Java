/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursos.java.Miercoles;

/*
    una clase se declara astracta nesesita la palabea reservada abstract
abstraccion
proceso de ocultar los detalles de implementacion y mostrar slo la funcionalidad al ussuarui
no conoce el procesamiento interno de la funcion la abstraccion permite centrarse en lo que hace el objeto en lugar de como lo hace
hay dos maneras de logar la abstraccion 
clase abstracta (0 a 100%)
Interface

una clase que se declara abstract no se conoce como clase abstracta. tiene que heredarse y sus metodos deben ser implementados. no puede instanciarse.

un metodo se declara abstract cuando no tiene imprementcion y tiene la palabra reserbada abstract 
 */
public class AbstractTest extends Bike2 {
    @Override
    void run(){
        System.out.println("el caballo corre por el campo");
    }
          public static void main(String[] args) {
              Bike2 n = new AbstractTest();
              n.run();
              new AbstractTest().run();
              
              
    }
  
}
abstract class Bike2{
    abstract void run();
}
